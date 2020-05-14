//Torbert, e-mail: smtorbert@fcps.edu
//version 6.17.2003
//Billington, version 7.25.2007

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


@SuppressWarnings("serial")
public class PinballPanel extends JPanel {
    // Constants
    private static final int FRAME = 400;
    private static final Color BACKGROUND = new Color(0, 0, 0);  // Black

    // Fields
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Ball ball;
    private Ball fireBall;
    private Timer t;
    private ImageIcon circle;

    /**
     * Creates a pinball that moves around and bounces off each edge of the screen.
     */
    public PinballPanel() {
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        myBuffer.setColor(BACKGROUND);
        myBuffer.fillRect(0, 0, FRAME, FRAME);

        // Randomly places the ball in the middle of the screen away from any edge
        int xPos = (int) (Math.random() * (FRAME - 100) + 50);
        int yPos = (int) (Math.random() * (FRAME - 100) + 50);

        // creates a black ball 50 pixels in diameter at (xPos, yPos)
        ball = new Ball(xPos, yPos, 50, (Color.white));
        fireBall = new Ball(xPos, yPos, 75, (Color.green));


        // Screen refreshes every 5 milliseconds (1/200 second)
        t = new Timer(5, new Listener());
        t.start();
    }

    /**
     * Draws the current state of the image on the screen.
     */
    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    /**
     * Updates the image to be drawn on the screen.
     * A Ball will move around the screen and bounce of each edge.
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Cover the old ball
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);

            // Move the ball to new spot within the dimensions of the screen
            fireBall.move(FRAME, FRAME);
            fireBall.drawPic(myBuffer);

            ball.move(FRAME, FRAME);
            ball.draw(myBuffer);

            repaint();
        }
    }
}