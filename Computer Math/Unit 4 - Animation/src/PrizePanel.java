//Name: Goral Pahuja   Date: 02/27/18

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

@SuppressWarnings("serial")
public class PrizePanel extends JPanel {

    private static final int FRAME = 400;
    private static final Color BACKGROUND = new Color(50, 150, 255); // light blue

    private BufferedImage myImage;
    private Graphics myBuffer;
    private Ball ball;
    private Polkadot pd;
    private Polkadot pd2;
    private Polkadot pd3;
    private Polkadot pd4;
//    private Polkadot pd5;
//    private Polkadot pd6;
//    private Polkadot pd7;
//    private Polkadot pd8;
//    private Polkadot pd9;
//    private Polkadot pd10;

    private Timer t;
    private int hits;

    /**
     * Creates a Ball moves around the screen and a Polkadot that jumps around the screen
     * each time the Ball collides with the Polkadot.
     */
    public PrizePanel() {
        // instantiate myImage and myBuffer
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        myBuffer.setColor(BACKGROUND);
        myBuffer.fillRect(0, 0, FRAME, FRAME);
        // instantiate the Ball object
        ball = new Ball();
        // instantiate the Polkadot object
        pd = new Polkadot();
        pd2 = new Polkadot();
        pd3 = new Polkadot();
        pd4 = new Polkadot();
//        pd5 = new Polkadot();
//        pd6 = new Polkadot();
//        pd7 = new Polkadot();
//        pd8 = new Polkadot();
//        pd9 = new Polkadot();
//        pd10 = new Polkadot();
        // instantiate the hits counter (The ball and polkadot have not collided yet)
        hits = -10;
        // instantiate the Timer object and start it
        t = new Timer(5, new Listener());
        t.start();

        addMouseListener(new Mouse());
        addKeyListener(new Key());
        setFocusable(true);
    }

    private class Mouse extends MouseAdapter {
        public void mousePressed(MouseEvent e) {

            ball.setColor(Color.black);

            if ((e.getButton() == MouseEvent.BUTTON3 || e.isMetaDown()) && e.isControlDown() && e.isAltDown()) {
                ball.setColor(Color.yellow);
                repaint();
                System.out.println("Right Mouse Button, Control, and Alt are being clicked!!!!");
            } else if ((e.getButton() == MouseEvent.BUTTON1 || !e.isMetaDown()) && e.isShiftDown()) {
                double dx = (Math.random() * 13) - 6;
                double dy = (Math.random() * 13) - 6;
                ball.setX(e.getX());
                ball.setY(e.getY());
                ball.setdx(dx);
                ball.setdy(dy);
                System.out.println("Left Mouse Button and Shift are being clicked!!!!");
            } else if (e.getButton() == MouseEvent.BUTTON3 || e.isMetaDown()) {
                pd.setX(e.getX());
                pd.setY(e.getY());
                pd2.setX(e.getX());
                pd2.setY(e.getY());
                pd3.setX(e.getX());
                pd3.setY(e.getY());
                pd4.setX(e.getX());
                pd4.setY(e.getY());
//                pd5.setX(e.getX());
//                pd5.setY(e.getY());
//                pd6.setX(e.getX());
//                pd6.setY(e.getY());
//                pd7.setX(e.getX());
//                pd7.setY(e.getY());
//                pd8.setX(e.getX());
//                pd8.setY(e.getY());
//                pd9.setX(e.getX());
//                pd9.setY(e.getY());
//                pd10.setX(e.getX());
//                pd10.setY(e.getY());
                System.out.println("Right Mouse Button is being clicked!!!!");
            } else {
                ball.setX(e.getX());
                ball.setY(e.getY());
                System.out.println("Left Mouse Button is being clicked!!!!");
            }
        }
    }

    private class Key extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W && pd.getY() - pd.getRadius() > 0) {
                double yCoord = pd.getY() - pd.getRadius() - 20;
                if (yCoord < pd.getRadius()) {
                    yCoord = pd.getRadius();
                }
                pd.setY(yCoord);
            }
            if (e.getKeyCode() == KeyEvent.VK_S && pd.getY() + pd.getRadius() < FRAME) {
                double yCoord = pd.getY() + 20;
                if (yCoord + pd.getRadius() > FRAME) {
                    yCoord = FRAME - pd.getRadius();
                }
                pd.setY(yCoord);
            }
            if (e.getKeyCode() == KeyEvent.VK_A && pd.getX() - pd.getRadius() > 0) {
                double xCoord = pd.getX() - pd.getRadius() - 20;
                if (xCoord < pd.getRadius()) {
                    xCoord = pd.getRadius();
                }
                pd.setX(xCoord);
            }
            if (e.getKeyCode() == KeyEvent.VK_D && pd.getX() + pd.getRadius() < FRAME) {
                double xCoord = pd.getX() + 20;
                if (xCoord + pd.getRadius() > FRAME) {
                    xCoord = FRAME - pd.getRadius();
                }
                pd.setX(xCoord);
            }

            if (e.getKeyCode() == KeyEvent.VK_T) {
                if (t.isRunning()) {
                    t.stop();
                    System.out.println("The timer has stopped. If you would like to resume the timer, please press the 'T' Key one more time");
                } else {
                    t.start();
                    System.out.println("Congratulations, your timer is back up and running");
                }
            }
        }
    }

    /**
     * Draws the current state of the image on the screen.
     */
    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }


    /**
     * The pinball moves around the screen bouncing off the walls.
     * If the pinball collides with the polkadot, the polkadot will jump to
     * another location on the screen and the counter will increase by 1.
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);

            int rVal = (int) (Math.random() * 255 + 1);
            int gVal = (int) (Math.random() * 255 + 1);
            int bVal = (int) (Math.random() * 255 + 1);
            Color c = new Color(rVal, gVal, bVal);

            ball.move(FRAME, FRAME);

            collide(ball, pd, rVal, gVal, bVal, c);
            collide(ball, pd2, rVal, gVal, bVal, c);
            collide(ball, pd3, rVal, gVal, bVal, c);
            collide(ball, pd4, rVal, gVal, bVal, c);
//            collide(ball, pd5, rVal, gVal, bVal, c);
//            collide(ball, pd6, rVal, gVal, bVal, c);
//            collide(ball, pd7, rVal, gVal, bVal, c);
//            collide(ball, pd8, rVal, gVal, bVal, c);
//            collide(ball, pd9, rVal, gVal, bVal, c);
//            collide(ball, pd10, rVal, gVal, bVal, c);

            ball.draw(myBuffer);

            pd.draw(myBuffer);
            pd2.draw(myBuffer);
            pd3.draw(myBuffer);
            pd4.draw(myBuffer);
//            pd5.draw(myBuffer);
//            pd6.draw(myBuffer);
//            pd7.draw(myBuffer);
//            pd8.draw(myBuffer);
//            pd9.draw(myBuffer);
//            pd10.draw(myBuffer);

            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 400, 25);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));

            repaint();
        }
    }


    /**
     * The pinball moves around the screen bouncing off the walls.
     * If the pinball collides with the polkadot, the polkadot will jump to
     * another location on the screen and the counter will increase by 1.
     *
     * @param b  a Ball object
     * @param pd a polkadot object
     */
    private void collide(Ball b, Polkadot pd, int rVal, int gVal, int bVal, Color c) {
        double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());
        c = new Color(rVal, gVal, bVal);

        // the polkadot and ball collide  if the distance between their centers is
        // less than the sum of their respective radii
        if (d <= (b.getRadius() + pd.getRadius())) {
            pd.jump(FRAME, FRAME);
            pd.setColor(c);
            pd.draw(myBuffer);

            hits += 1;
        }
    }


    /**
     * Finds the distance between two points using the distance formula
     *
     * @param x1 the x-coordinate of the first object
     * @param y1 the y-coordinate of the first object
     * @param x2 the x-coordinate of the second object
     * @param y2 the y-coordinate of the second object
     * @return the distance between the two coordinates
     */
    private double distance(double x1, double y1, double x2, double y2) {
        double dist = 0;

        // enter the cacluation here replacing the 0.  See page 38 for an example of Math.sqrt() and Math.pow()
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return dist;
    }
}