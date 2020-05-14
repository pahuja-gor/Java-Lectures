import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lab02 extends JPanel{
	public void paintComponent (Graphics g) {
	ImageIcon picture = new ImageIcon ("Bill Nye.jpg");
	
	g.setColor(new Color (0, 191, 255));
	//Creates the left edge of the frame
	for (int y = 55; y <= 700; y+=30) {
		g.fillOval(120, y, 30, 30);
	}
	
	//Creates the right edge of the frame
	for (int y = 55; y <= 700; y+=30) {
		g.fillOval(659, y, 30, 30);
	}
	
	//Creates the top edge of the frame
	for (int x = 150; x <= 640; x+=30) {
		g.fillOval(x, 55, 30, 30);
	}
	
	//Creates the bottom edge of the frame
	for (int x = 150; x <= 640; x+=30) {
		g.fillOval(x, 685, 30, 30);
	}
	
	g.drawImage(picture.getImage(), 135, 70, 540, 630, null);
	
	//Writes "Our Fearless Leader"
	g.setFont(new Font ("Roboto", Font.BOLD | Font.ITALIC, 50));
	g.setColor(new Color(255, 99, 71));
	g.drawString("Our Fearless Leader", 155, 753);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Our Fearless Leader");
		frame.setBackground(Color.black);
		frame.setSize(800, 800);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Lab02());
		frame.setVisible(true);
	}

}