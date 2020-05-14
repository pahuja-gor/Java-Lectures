import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.*;

public class MultipleButtons extends JPanel {
    private JLabel label;

    public MultipleButtons() {

        setLayout(new FlowLayout());

        /**
         * Creates a button that generates a random number from 0 to 100 when clicked upon.
         */
        JButton randomButton = new JButton("Random");
        randomButton.addActionListener(new RandomListener());
        add(randomButton);

        /**
         * Creates a button that takes the e^x of a number x when clicked upon.
         */
        JButton eulersButton = new JButton("e^x");
        eulersButton.addActionListener(new EulerListener());
        add(eulersButton);

        /**
         * Creates a button that takes the base 10 logarithm of a number x when clicked upon.
         */
        JButton logButton = new JButton("log(x)");
        logButton.addActionListener(new LogListener());
        add(logButton);

        /**
         * Creates a button that exits the program when clicked upon.
         */
        JButton quitButton = new JButton("QUIT");
        quitButton.addActionListener(new QuitListener());
        add(quitButton);

        label = new JLabel("0.0");
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setForeground(Color.red);
        add(label);
    }

    /**
     * Generates a random number from 0 to 100
     */
    private class RandomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double x = (0 + Math.random() * 100.0);
            label.setText("" + x);
        }
    }

    /**
     * Takes the e^x of a number x
     */
    private class EulerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double x = Double.parseDouble(label.getText());
            x = exp(x);
            label.setText("" + x);
        }
    }

    /**
     * Takes the base 10 logarithm of a number x
     */
    private class LogListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double x = Double.parseDouble(label.getText());
            x = log10(x);
            label.setText("" + x);
        }
    }

    /**
     * Exits the program, essentially closing it
     */
    private class QuitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab02 - Multiple Buttons");
        frame.setSize(325, 125);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MultipleButtons());
        frame.setVisible(true);
    }
}