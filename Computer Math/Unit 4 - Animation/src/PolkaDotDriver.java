// Lab10 - Two Polkadots jump around the screen

import javax.swing.JFrame;

public class PolkaDotDriver
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Unit2, Lab10: Polka Dots");
      frame.setSize(400, 400);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PolkaDotPanel());
      frame.setVisible(true);
   }
}