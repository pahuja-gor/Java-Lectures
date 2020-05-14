import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author
 */
public class PressYourLuckPanel extends JPanel {

    private PressYourLuckDisplay display;

    /**
     * Creates the display and button to Press Your Luck
     */
    public PressYourLuckPanel() {
        setLayout(new FlowLayout());
        setBackground(new Color(255, 131, 0));

        display = new PressYourLuckDisplay();
        add(display);

        JButton pressYourLuck = new JButton("Press Your Luck");
        pressYourLuck.setSize(10, 20);
        pressYourLuck.setBackground(Color.green);
        pressYourLuck.addActionListener(new Listener());
        add(pressYourLuck);

    }

    /**
     * Updates the display
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.update();
        }
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Press Your Luck");
        frame.setSize(215, 215);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PressYourLuckPanel());
        frame.setVisible(true);

    }

}