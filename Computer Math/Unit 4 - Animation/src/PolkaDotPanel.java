// PolkadotPanel.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.prefs.BackingStoreException;

@SuppressWarnings("serial")
public class PolkaDotPanel extends JPanel {
    //constants
    private static final int FRAME = 400;
    private static final Color BACKGROUND = new Color(255, 148, 0);  // Orange

    //fields
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Timer timer;
    private Polkadot pd;
    private Polkadot pd2;
    private int xPos, yPos; // xPos = "X Position"    yPos = "Y Position)

    /**
     * Creates a polkadot that can jump around the screen.
     */
    public PolkaDotPanel() {
        // Creates a buffered image, able to be resized when the dimensions of the window changes
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();

        // Creates the background color to BACKGROUND (defined above)
        myBuffer.setColor(BACKGROUND);
        myBuffer.fillRect(0, 0, FRAME, FRAME);

        // Instantiate a new Polkadot
        pd = new Polkadot();
        pd2 = new Polkadot(xPos, yPos, 40, (new Color(0, 255, 135)));
        // the Timer calls the Listener every 500 milliseconds (1/2 second)
        // 1000 milliseconds = 1 second
        // the Timer acts as an infinite loop, updating every X milliseconds
        timer = new Timer(500, new Listener());
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
     * Updates the image to be drawn on the screen.
     * Two polkadots of different sizes and colors will jump around the screen.
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pd.setColor(BACKGROUND);
            pd.draw(myBuffer);
            pd.setColor(Color.red);
            // polkadot pd moves to a new random location and is drawn
            pd.jump(FRAME, FRAME);
            pd.draw(myBuffer);

            pd2.setColor(BACKGROUND);
            pd2.draw(myBuffer);
            pd2.setColor(new Color(0, 255, 135));
            // polkadot pd moves to a new random location and is drawn
            pd2.jump(FRAME, FRAME);
            pd2.draw(myBuffer);
            repaint();  // repaint() addes the updated data to the screen
            // repaint() is called once, at the last line actionPerformed
        }
    }
}