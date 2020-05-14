// Lab10 - Two balls move around the screen

import javax.swing.JFrame;

public class PinballDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab11: Pinball");
        frame.setSize(800, 800);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PinballPanel());
        frame.setVisible(true);
    }
}