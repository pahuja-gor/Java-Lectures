import javax.swing.*;
import java.awt.*;


public class Odometer extends JPanel {

    private JLabel hundreds;
    private JLabel tens;
    private JLabel ones;

    private int total;

    /**
     * Constructor class for the Odometer
     */
    public Odometer() {

        // This is the constructor.
        // Set the layout, set the background.
        // Instantiate all objects and variables
        // declared and set their properties.

        setLayout(new FlowLayout());

        total = 0;

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        add(panel);
        panel.setBackground(Color.red);

        hundreds = new JLabel("" + 0);
        hundreds.setFont(new Font("Serif", Font.BOLD, 100));
        hundreds.setForeground(Color.orange);
        panel.add(hundreds);

        tens = new JLabel("" + 0);
        tens.setFont(new Font("Serif", Font.BOLD, 100));
        tens.setForeground(Color.orange);
        panel.add(tens);

        ones = new JLabel("" + 0);
        ones.setFont(new Font("Serif", Font.BOLD, 100));
        ones.setForeground(Color.orange);
        ones.setOpaque(true);
        panel.add(ones);
    }

    /**
     * Changes the labels (ones, tens, and hundreds) based off of the division properties and modular operations
     */
    public void updateOdometer() {

        // Increment the total count.
        // Set each label to its proper value.

        total++;
        System.out.println("The 'double' total is " + total);

        if (total % 100 == 0) {
            hundreds.setText("" + (total / 100));
            tens.setText("" + 0);
            ones.setText("" + 0);
        } else /*if ((total % 100 != 0))*/ {
            if (total % 100 < 10) {
                ones.setText("" + (total % 100));
            }
            if (total % 100 > 9) {
                if (total % 10 == 0) {
                    tens.setText("" + ((total % 100) / 10));
                    ones.setText("" + 0);
                }
                if (total % 10 != 0) {
                    ones.setText("" + (total % 10));
                }
            }
        }
    }

    public void resetOdometer() {
        ones.setText("0");
        tens.setText("0");
        hundreds.setText("0");
        System.out.println("The 'double' total is 0");
    }
}