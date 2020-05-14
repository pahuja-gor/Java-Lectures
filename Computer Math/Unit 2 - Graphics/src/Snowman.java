import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Snowman extends JPanel {

	public int x1[] = { 338, 338, 400 };
	public int y1[] = { 265, 290, 285 };

	public void paintComponent(Graphics g) {

		// Head
		g.setColor(Color.white);
		g.fillOval(275, 210, 150, 150);

		// Hat (Head Part)
		g.setColor(Color.red.brighter());
		g.fillRect(300, 70, 100, 150);

		// Hat (Brim Part)
		g.setColor(Color.red.brighter());
		g.fillRect(258, 190, 180, 30);

		// Left Eye
		g.setColor(Color.green.brighter());
		g.fillOval(310, 240, 25, 25);

		// Right Eye
		g.setColor(Color.green.brighter());
		g.fillOval(365, 240, 25, 25);

		// Mouth
		g.fillArc(300, 245, 100, 100, 0, -180);

		//Nose
		g.setColor(Color.orange);
		g.fillPolygon(x1, y1, 3);

		// Body
		g.setColor(Color.white);
		g.fillOval(245, 345, 200, 200);

		g.setColor(Color.RED);
		// Left Arm (From viewer's perspective)
		g.drawLine(260, 390, 200, 200);
		// Right Arm (From viewer's perspective)
		g.drawLine(430, 390, 490, 200);

		g.setColor(Color.black);
		// Button 1 (Top Button)
		g.fillOval(330, 385, 30, 30);
		// Button 2 (Middle Button)
		g.fillOval(330, 430, 30, 30);
		// Button 3 (Bottom Button)
		g.fillOval(330, 475, 30, 30);

		// Legs
		g.setColor(Color.white);
		g.fillOval(220, 520, 235, 235);

		// Snow
		g.setColor(Color.WHITE);
		g.fillRect(0, 750, 700, 42);

		// g.setColor(Color.WHITE);
		// g.drawLine(0, 0, 50, 50); //Snowflake Part 1
		// g.drawLine(50, 0, 0, 50); //Snowflake Part 2
		// g.drawLine(25, 0, 25, 50); //Snowflake Part 3
		// g.drawLine(0, 25, 50, 25); //Snowflake Part 4
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Think Snow");
		frame.setBackground(new Color(4, 156, 249));
		frame.setSize(700, 830);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Snowman());
		frame.setVisible(true);
	}
}