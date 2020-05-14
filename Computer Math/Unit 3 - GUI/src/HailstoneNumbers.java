//Name: Goral Pahuja Date: 5/30/18

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HailstoneNumbers extends JPanel {
    private JLabel hailstoneLabel, iteratorLabel;
    private JTextField box;
    private int hailstoneNumber, count;

    /**
     * Displays the hailstone number in the center of the frame.
     * A text field allows the user to enter a number followed by
     * 3 buttons to set the number, find the next value, or quit
     * the program. The number of iterations are kept on the bottom of the screen.
     */
    public HailstoneNumbers() {
        setLayout(new FlowLayout());
        hailstoneNumber = 37;
        count = 0;

        // Displays Hailstone number
        hailstoneLabel = new JLabel("" + hailstoneNumber);
        hailstoneLabel.setFont(new Font("Serif", Font.BOLD, 100));
        hailstoneLabel.setForeground(Color.blue);
        add(hailstoneLabel);

        // Creates a sub-panel for the text field and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        add(panel);

        // Text field
        box = new JTextField("37", 5);
        box.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(box);

        /**
         * Creates a button that sets a new value.
         */
        JButton setButton = new JButton("New Value");
        setButton.addActionListener(new SetListener());
        panel.add(setButton);

        /**
         * Creates a button that finds the next Hailstone value.
         */
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new NextListener());
        panel.add(nextButton);


        /**
         * Creates a button that quits the program.
         */
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new QuitListener());
        panel.add(quitButton);

        // Iterator label (on original panel)
        iteratorLabel = new JLabel("Iterations: " + count);
        add(iteratorLabel);
    }

    /**
     * Displays the Hailstone Number
     */
    private class SetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int x = Integer.parseInt(box.getText());
            hailstoneLabel.setText("" + x);
            count = 0;
            iteratorLabel.setText("Iterations: " + count);
        }
    }

    /**
     * Generates the next Hailstone Number
     */
    private class NextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int x = Integer.parseInt(hailstoneLabel.getText());
            if (x % 2 == 0) {
                x = x / 2;
                hailstoneLabel.setText("" + x);
                count += 1;
                iteratorLabel.setText("Iterations: " + count);
            } else if ((x % 2 != 0)/* && (x % 2 != 1.0) && (x % 2 != 1)*/) {
                x = (3 * x) + 1;
                if (x != 4.0) {
                    hailstoneLabel.setText("" + x);
                    count += 1;
                    iteratorLabel.setText("Iterations: " + count);
                }
            }
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
        JFrame frame = new JFrame("Lab03 - Hailstone Numbers");
        frame.setSize(825, 225);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new HailstoneNumbers());
        frame.setVisible(true);
    }
}