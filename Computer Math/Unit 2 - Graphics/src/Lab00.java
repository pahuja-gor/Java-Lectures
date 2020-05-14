import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lab00 extends JPanel{
		
	public void paintComponent (Graphics g) {
		g.setColor(Color.YELLOW.darker());
		g.fillRect(75, 0, 600, 125);
		//g.setColor(Color.CYAN);
		//g.fillRect(0, 0, 100, 100);
		g.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		g.setColor(new Color(255, 0, 255));
		g.drawString("Hello World", 100, 85);
		//g.drawLine(10, 10, 20, 20);
		
		g.setFont(new Font("Comic Sans", Font.ITALIC, 100));
		g.setColor(Color.RED.darker());
		g.drawString("IT was HERE!!!", 50, 200);
				
		g.setColor(new Color(252, 123, 0).brighter());
		g.fillOval(185, 200, 350, 100);
		g.setFont(new Font("Impact", Font.ROMAN_BASELINE | Font.BOLD | Font.ITALIC, 50));
		g.setColor(new Color(255, 69, 0));
		g.drawString("Time to Code!", 200, 270);
		
		g.setColor(Color.green.brighter());
		g.fillRoundRect(0, 320, 780, 100, 100, 100);
		g.setFont(new Font("Courier New", Font.BOLD | Font.CENTER_BASELINE | Font.ITALIC, 100));
		g.setColor(new Color(64, 224, 208));
		g.drawString("Computer Math", 0, 400);
	}
	
	//Driver
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Lab00 - Hello World!");
		frame.setSize(800, 470);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Lab00());
		frame.setVisible(true);
	}

}