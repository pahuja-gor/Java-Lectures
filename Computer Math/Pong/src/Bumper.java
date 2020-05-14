// Name: Goral Pahuja				Date: 3/5/18

import java.awt.*;

public class Bumper {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.
    private int myX;
    private int myY;
    private int myXWidth;
    private int myYWidth;
    private Color myColor;

    /**
     * Creates an orange colored bumper centered at (275, 275) with a width of 100 and a height of 75
     */
    public Bumper() {
        myX = 275;
        myY = 275;

        myXWidth = 75;
        myYWidth = 100;

        myColor = new Color(255, 138, 56);
    }

    /**
     * Creates a bumper of color c centered at (x, y) with a height of yWidth and a width of xWidth
     *
     * @param x      the x-coordinate of the center of the bumper
     * @param y      the y-coordinate of the center of the bumper
     * @param xWidth the width of the bumper
     * @param yWidth the height of the bumper
     * @param c      the color of the bumper
     */
    public Bumper(int x, int y, int xWidth, int yWidth, Color c) {
        myX = x;
        myY = y;
        myXWidth = xWidth;
        myYWidth = yWidth;
        myColor = c;
    }

    //***********************************************
    //
    //  Accessor methods  (one for each field)
    //  Comment each method with proper Javadoc
    //
    //***********************************************

    /**
     * Gets the x-coordinate of the center of the bumper
     *
     * @return the x-coordinate of the center of the bumper
     */
    public int getX() {
        return myX;
    }

    /**
     * Gets the y-coordinate of the center of the bumper
     *
     * @return the y-coordinate of the center of the bumper
     */
    public int getY() {
        return myY;
    }

    /**
     * Gets the width along the x-axis of the center of the bumper
     *
     * @return the width along the x-axis of the center of the bumper
     */
    public int getXWidth() {
        return myXWidth;
    }

    /**
     * Gets the width along the y-axis of the bumper
     *
     * @return the width along the y-axis of the  bumper
     */
    public int getYWidth() {
        return myYWidth;
    }

    /**
     * Gets the color of the bumper
     *
     * @return the color of the bumper
     */
    public Color getColor() {
        return myColor;
    }


    //***********************************************
    //
    //  Modifier methods  (one for each field)
    //  Comment each method with proper Javadoc
    //
    //***********************************************

    /**
     * Sets the x-coordinate of the center of the bumper
     *
     * @param x the x-coordinate of the center of the bumper
     */
    public void setX(int x) {
        myX = x;
    }

    /**
     * Sets the y-coordinate of the center of the bumper
     *
     * @param y the y-coordinate of the center of the bumper
     */
    public void setY(int y) {
        myY = y;
    }

    /**
     * Sets the width of the bumper
     *
     * @param xWidth the width of the bumper
     */
    public void setMyXWidth(int xWidth) {
        myXWidth = xWidth;
    }

    /**
     * Sets the height of the bumper
     *
     * @param yWidth height of the bumper
     */
    public void setMyYWidth(int yWidth) {
        myYWidth = yWidth;
    }

    /**
     * Sets the color of the bumper
     *
     * @param c the color of the bumper
     */
    public void setMyColor(Color c) {
        myColor = c;
    }


    //************************
    //
    // Instance methods
    //
    //************************


    /**
     * Chooses a random (x,y) location for the Bumper.  Bumper stays entirely in the window.
     *
     * @param rightEdge  the right side of the window
     * @param bottomEdge the bottom side of the window
     */
    public void jump(int rightEdge, int bottomEdge) {
        // moves location to random (x, y) within the edges
        myX = (int) (Math.random() * 400) + 1;
        myY = (int) (Math.random() * 400) + 1;

        setX(getX());
        setY(getY());

        if (getX() >= rightEdge - getXWidth()) {
            setX(rightEdge - getXWidth());
        } else if (getX() <= getXWidth()) {
            setX(getXWidth());
        }
        if (getY() >= bottomEdge - getYWidth()) {
            setY(bottomEdge - getYWidth());
        } else if (getY() <= getYWidth()) {
            setY(getYWidth());
        }
    }

    /**
     * Draws a rectangular bumper on the buffer
     *
     * @param myBuffer the picture drawn on the screen
     */
    public void draw(Graphics myBuffer) {
        myBuffer.setColor(getColor());
        myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
    }


    /**
     * Returns true if any part of the Polkadot is inside the bumper
     *
     * @return true if any part of the polkadot is inside the bumper
     */
    public boolean inBumper(Polkadot dot) {
        for (int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
            for (int y = getY(); y <= getY() + getYWidth(); y++)
                if (distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius()) //checks every point on the bumper
                    return true;
        return false;
    }


    /**
     * Calculates the distance between (x1, y1) and (x2, y2)
     *
     * @param x1 x-coordinate of the first point
     * @param y1 y-coordinate of the first point
     * @param x2 x-coordinate of the second point
     * @param y2 y-coordinate of the second point
     * @return the distance between (x1, y1) and (x2, y2)
     */
    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}