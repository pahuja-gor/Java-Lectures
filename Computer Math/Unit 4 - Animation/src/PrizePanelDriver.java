import javax.swing.*;

public class PrizePanelDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab12: Get the Prize");
        frame.setSize(404, 438);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PrizePanel());
        frame.setVisible(true);
    }
}
