import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class BumperPanel extends JPanel {
    private static final int FRAME = 500;
    private static final Color BACKGROUND = new Color(31, 204, 60);
    private static final Color BALL_COLOR = Color.YELLOW;
    private static final Color PRIZE_COLOR = Color.CYAN;
    private static final Color BUMPER_COLOR = Color.RED;
    private static final double BALL_DIAM = 45;
    private static final double PRIZE_DIAM = 35;
    private static final int BUMPER_X_WIDTH = 100;
    private static final int BUMPER_Y_WIDTH = 120;

    private BufferedImage myImage;
    private Graphics myBuffer;
    private Ball ball;
    private Polkadot prize;
    private Bumper bumper;
    private int hits;
    private Timer timer;

    public BumperPanel() {
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();

        // create ball and jump
        ball = new Ball(100, 200, BALL_DIAM, BALL_COLOR);  // Use the constants defined above for
        ball.jump(FRAME, FRAME);

        // create prize and jump
        prize = new Polkadot(200, 200, PRIZE_DIAM, PRIZE_COLOR);
        prize.jump(FRAME, FRAME);

        // create bumper and jump
        bumper = new Bumper(350, 200, BUMPER_X_WIDTH, BUMPER_Y_WIDTH, BUMPER_COLOR);
        bumper.jump(FRAME, FRAME);

        // ensure ball is outside the bumper
        if ((ball.getX() >= (bumper.getX() - bumper.getXWidth())) && (ball.getX() <= (bumper.getX() + bumper.getXWidth()))) {
            ball.jump(FRAME, FRAME);
        }

        if ((ball.getY() >= (bumper.getY() - bumper.getYWidth())) && (ball.getY() <= (bumper.getY() + bumper.getYWidth()))) {
            ball.jump(FRAME, FRAME);
        }

        // ensure prize (polkadot) is outside the bumper
        if ((prize.getX() >= (prize.getX() - prize.getRadius())) && (prize.getX() <= (prize.getX() + prize.getRadius()))) {
            prize.jump(FRAME, FRAME);
        }

        if ((prize.getY() >= (prize.getY() - prize.getRadius())) && (prize.getY() <= (prize.getY() + prize.getRadius()))) {
            prize.jump(FRAME, FRAME);
        }

        hits = 0;
        timer = new Timer(5, new Listener());
        timer.start();
    }

    /**
     * Draws the current state of the image on the screen.
     *
     * @param g the Graphics object
     */
    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }


    /**
     * The Ball moves around the screen and bounces off the sides of the window
     * and Bumper.  If the Ball collides with the Polkadot, the Polkadot will relocate
     * itself and the counter will increase by one.
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // clear buffer and move ball
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            ball.move(FRAME, FRAME);

            // check for collisions
            collide(ball, prize);
            BumperCollision.collide(bumper, ball);

            // draw ball, bumper & prize
            ball.draw(myBuffer);
            prize.draw(myBuffer);
            bumper.draw(myBuffer);

            // ensure the prize did not jump inside the bumper
            while (bumper.inBumper(prize)) {
                prize.jump(FRAME, FRAME);
            }

            // update hits on buffer
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 150, 25);

            repaint();
        }
    }

    /**
     * Checks to see if the ball & prize collide.
     * If so, increment hits & relocate prize
     *
     * @param b Comment...
     * @param p Comment...
     */
    public void collide(Ball b, Polkadot p) {
        // find distance between ball & prize centers
        double dist = distance(b.getX(), b.getY(), p.getX(), p.getY());

        // if the ball and polkadot collide, increment hits and relocate prize
        if (dist < p.getRadius() + b.getRadius()) {
            hits++;
            p.jump(FRAME, FRAME);        // relocate prize
        }
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