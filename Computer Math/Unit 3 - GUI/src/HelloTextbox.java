import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.sqrt;

public class HelloTextbox extends JPanel {
    private JTextField box;
    private JLabel label;

    public HelloTextbox() {
        setLayout(new FlowLayout());

        box = new JTextField("0.0", 10);
        box.setHorizontalAlignment(SwingConstants.RIGHT);
        add(box);

        JButton button = new JButton("Square Root");
        button.addActionListener(new Listener());
        add(button);

        label = new JLabel("0.0");
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setForeground(Color.blue);
        add(label);
    }

    /**
     * Takes the square root of the number that is typed into the Textbox
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Reads the text from the textbox as a double
            //Stores the value into the double, num
            double num = Double.parseDouble(box.getText());

            if (num < 0) {
                //Takes the square root of the negated form of the negative double, num, making it positive.
                //Which returns a positive value after being square rooted.
                num = sqrt(-num);
                //Sets the label to be the square root of the positive value attached with an "i"
                label.setText("" + num + "i");
            } else {
                //Takes the square root of the positive double, num.
                num = sqrt(num);
                //Sets the label to be the new value of num (square root of positive double, num)
                label.setText("" + num);
            }
        }
    }

    //Visual Studio Live
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab01 - Hello Textbox");
        frame.setSize(325, 125);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new HelloTextbox());
        frame.setVisible(true);
    }
}