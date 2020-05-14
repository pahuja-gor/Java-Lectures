import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloButton extends JPanel {
    private JLabel label;

    public HelloButton() {
        setLayout(new FlowLayout());

        label = new JLabel("0.000000000000000000000000000");
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setForeground(Color.blue);
        add(label);

        JButton button = new JButton("Random");
        button.addActionListener(new Listener());
        add(button);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double x = Math.random() * 10;
//            int x = (int)(Math.random() * 9);
            label.setText("" + x);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab00 - Hello Button");
        frame.setSize(325, 125);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new HelloButton());
        frame.setVisible(true);
    }
}