//Name: Goral Pahuja               

import javax.swing.*;
import java.awt.*;


public class Ball extends Polkadot {
    /**
     * The number of pixels (change in x) the ball will move horizontally each time
     * move() is called.  If x is positive, the ball will move right.
     * If x is negative, the ball will move to the left.
     */
    private double dx;


    /**
     * The number of pixels (change in y) the ball will move vertically each time
     * move() is called.  If y is positive, the ball will move down.
     * If y is negative, the ball will move to the up.
     */
    private double dy;


    /**
     * Creates a black ball at (200, 200) that is 50 pixels in diameter and will
     * randomly move -6 to +6 pixels up/down and left/right
     */
    public Ball() {
        super(200, 200, 50, Color.BLACK);

        // randomly assigns a value for the change in x on the interval [-6, 6]
        dx = (Math.random() * 13) - 6;

        // randomly assigns a value for the change in y on the interval [-6, 6]
        dy = (Math.random() * 13) - 6;
    }


    /**
     * Creates a ball of Color c at (x, y) that is dia pixels in diameter and will
     * randomly move -6 to +6 pixels up/down and left/right
     */
    public Ball(double x, double y, double dia, Color c) {
        super(x, y, dia, c);

        // randomly assigns a value for the change in x on the interval [-6, 6]
        dx = (Math.random() * 13) - 6;

        // randomly assigns a value for the change in y on the interval [-6, 6]
        dy = (Math.random() * 13) - 6;
    }


    //***********************************************
    //
    //  Modifier methods  (one for each new field)
    //  Comment each method with proper Javadoc
    //
    //***********************************************


    /**
     * Sets the number of pixels the ball moves horizontally
     *
     * @param x the number of pixels the ball moves horizontally
     */
    public void setdx(double x) {
        dx = x;
    }

    /**
     * Sets the number of pixels the ball moves vertically
     *
     * @param y the number of pixels the ball moves vertically
     */
    public void setdy(double y) {
        dy = y;
    }


    //***********************************************
    //
    //  Accessor methods  (one for each new field)
    //  Comment each method with proper Javadoc
    //
    //***********************************************


    /**
     * Gets the number of pixels the ball moves horizontally
     *
     * @return the number of pixels the ball moves horizontally
     */
    public double getdx() {
        return dx;
    }

    /**
     * Gets the number of pixels the ball moves vertically
     *
     * @return the number of pixels the ball moves vertically
     */
    public double getdy() {
        return dy;
    }


    //*******************************************
    //
    //       Instance Methods
    //
    //*******************************************


    /**
     * Move the ball within the dimensions of the screen (rightEdge, bottomEdge).
     * When the ball collides with any edge of the screen, the ball will move
     * in the opposite direction.
     *
     * @param rightEdge  the right side of the screen and its largest x-coordinate
     * @param bottomEdge the bottom side of the screen and its largest y-coordinate
     */
    public void move(double rightEdge, double bottomEdge) {
        // change the x-coordinate of the ball so it moves
        // Translation:   x = x + dx
        setX(getX() + dx);

        // If the ball hits the right edge, change dx (the direction the ball travels)
        // Translation:  The x-coord of the ball (center) is past the right edge - radius of the ball
        if (getX() >= rightEdge - getRadius()) {
            // place the ball on the right edge of screen
            setX(rightEdge - getRadius());

            // change directions (now move left)
            dx = dx * -1;
        } else if (getX() <= (rightEdge - rightEdge) + getRadius()) {
            setX((rightEdge - rightEdge) + getRadius());
            dx = dx * -1;
        }

        // change the y-coordinate of the ball so it moves
        // Translation:   y = y + dy
        setY(getY() + dy);

        // If the ball hits the bottom edge, change dy (the direction the ball travels)
        // Translation:  The y-coord of the ball (center) is past the bottom edge - radius of the ball
        if (getY() >= bottomEdge - getRadius()) {
            // place the ball on the bottom edge of screen
            setY(bottomEdge - getRadius());

            // change directions (now move up)
            dy = dy * -1;
        } else if (getY() <= (bottomEdge - bottomEdge) + getRadius()) {
            setY((bottomEdge - bottomEdge) + getRadius());
            dy = dy * -1;
        }
    }

    public void drawPic(Graphics myBuffer) {
        ImageIcon image = new ImageIcon("C:\\Users\\gorpa\\Documents\\GitHub\\Java-Programs\\Java Programs for School\\Pong\\PB.png");
        myBuffer.drawImage(image.getImage(), (int) ((getX()) - (getRadius())), (int) ((getY()) - (getRadius())), (int) getDiameter(), (int) getDiameter(), null);
    }
}