import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class OdometerPanel extends JPanel {

    private Odometer odometer;

    /**
     * Sets up the 'Step' Button
     */
    public OdometerPanel() {

        setLayout(new FlowLayout());

        odometer = new Odometer();
        add(odometer);

        JButton button = new JButton("Step");
        button.addActionListener(new ButtonListener());
        add(button);

        JButton reset = new JButton("Reset");
        reset.addActionListener(new resetListener());
        add(reset);
    }

    /**
     * Every time the button 'Step' is pressed, the labels change based off of the operations being conducted in Odometer.java
     */
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            odometer.updateOdometer();
        }
    }

    private class resetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            odometer.resetOdometer();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab04 - Odometer");
        frame.setSize(250, 250);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new OdometerPanel());
        frame.setVisible(true);

    }

}