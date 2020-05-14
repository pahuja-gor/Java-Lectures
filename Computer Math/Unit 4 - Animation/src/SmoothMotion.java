// PrizePanel with smooth movement so mutliple buttons can be
// pressed at the same time.
//
// Blue polkadot movement - WASD

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class SmoothMotion extends JPanel {
    private static final int FRAME = 400;
    private static final Color BACKGROUND = new Color(102, 178, 255);
    private static final int PIXELS = 3;
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Ball ball;
    private Polkadot pd, pdBlue;
    private Timer t;
    private int hits;

    private boolean wPressed, sPressed, aPressed, dPressed;

    public SmoothMotion() {
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();

        ball = new Ball();
        pd = new Polkadot();
        pdBlue = new Polkadot();
        pdBlue.setColor(Color.blue.darker());

        hits = -1;

        wPressed = sPressed = aPressed = dPressed = false;

        t = new Timer(5, new Listener());
        t.start();

        // Add a "Listener" where the mouse controls some of the output
        addMouseListener(new Mouse());

        // Add a "Listener" for the keyboard controls
        addKeyListener(new Key());
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }


    /**
     * The screen is refreshed every time the Timer updates
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);

            // moves the blue polkadot smoothly
            updateBluePolkadot();

            ball.move(FRAME, FRAME);
            collide(ball, pd);
            collide(ball, pdBlue);

            ball.draw(myBuffer);
            pd.draw(myBuffer);
            pdBlue.draw(myBuffer);

            myBuffer.setColor(Color.BLACK);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
            repaint();
        }
    }

    private void collide(Ball b, Polkadot pd) {

        double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());

        if (d <= (b.getRadius() + pd.getRadius())) {
            pd.jump(FRAME, FRAME);

            hits++;

        }
    }

    /**
     * Calculates the distance between two points (x1, y1) and (x2, y2)
     *
     * @param x1 the x-coordinate of the first point
     * @param y1 the y-coordinate of the first point
     * @param x2 the x-coordinate of the second point
     * @param y2 the y-coordinate of the second point
     * @return the distance between two points (x1, y1) and (x2, y2)
     */
    private double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));     // enter the calculation here.
    }

    private class Mouse extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            // No code shown for Mouse Input
        }
    }

    // moves the BLUE polkadot based upon which keys are
    // pressed or released
    public void updateBluePolkadot() {
        if (wPressed == true)
            pdBlue.setY(pdBlue.getY() - PIXELS);
        if (aPressed == true)
            pdBlue.setX(pdBlue.getX() - PIXELS);
        if (sPressed == true)
            pdBlue.setY(pdBlue.getY() + PIXELS);
        if (dPressed == true)
            pdBlue.setX(pdBlue.getX() + PIXELS);

    }

    // Determines all keys that are pressed or released
    private class Key extends KeyAdapter {
        // Determines which keys are pressed
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W)
                wPressed = true;
            if (e.getKeyCode() == KeyEvent.VK_A)
                aPressed = true;
            if (e.getKeyCode() == KeyEvent.VK_S)
                sPressed = true;
            if (e.getKeyCode() == KeyEvent.VK_D)
                dPressed = true;
        }

        // Determines which keys are released
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W)
                wPressed = false;
            if (e.getKeyCode() == KeyEvent.VK_A)
                aPressed = false;
            if (e.getKeyCode() == KeyEvent.VK_S)
                sPressed = false;
            if (e.getKeyCode() == KeyEvent.VK_D)
                dPressed = false;
        }
    }
}