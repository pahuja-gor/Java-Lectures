import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lab01 extends JPanel {

	public void paintComponent(Graphics g) {
		// Sets the background color
		g.setColor(new Color(38, 161, 255));
		g.fillRect(0, 0, 383, 350);

		// Draws the sun
		g.setColor(Color.YELLOW);
		g.fillOval(275, 50, 75, 75);
		
		//Draws the clouds
		g.setColor(Color.white);
		drawCloud(g, 80, 50, 30, 30);
		drawCloud(g, 190, 50, 30, 30);
		drawCloud(g, 300, 50, 30, 30);

		// Draws the green ground
		g.setColor(Color.green.darker());
		g.fillRect(0, 350, 384, 10);

		// Draws a square for red walls
		g.setColor(Color.red);
		g.fillRect(100, 200, 150, 150);

		// Draws a solid black door with a white door knob
		g.setColor(Color.black);
		g.fillRect(150, 275, 50, 75);
		g.setColor(Color.white);
		g.fillOval(187, 310, 10, 10);

		// Draws a fence
		g.setColor(Color.white);
		for (int k = 0; k <= 385; k += 10) {
			g.drawLine(k, 300, k, 350);
		}
		g.drawLine(0, 325, 380, 325);

		// Draws two windows
		Window window = new Window (115, 220, 40, 40);
		Window window2 = new Window (195, 220, 40, 40);
		window.draw(g);
		window2.draw(g);
		/*
		g.setColor(new Color(0, 174, 255));
		g.fillRect(115, 220, 40, 40);
		g.setColor(Color.black);
		g.drawLine(115, 240, 155, 240);
		g.drawLine(135, 220, 135, 260);

		g.setColor(new Color(0, 174, 255));
		g.fillRect(195, 220, 40, 40);
		g.setColor(Color.black);
		g.drawLine(195, 240, 235, 240);
		g.drawLine(215, 220, 215, 260);
		 */

		// Draws a chimney with smoke
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(215, 110, 11, 11);
		g.fillOval(217, 110, 13, 13);
		g.fillOval(219, 108, 15, 15);
		g.fillOval(221, 110, 19, 19);
		g.fillOval(221, 105, 21, 21);
		g.fillOval(221, 103, 25, 25);
		g.fillOval(224, 101, 27, 27);
		g.fillOval(227, 98, 29, 29);
		g.fillOval(227, 103, 29, 29);
		g.fillOval(230, 99, 31, 31);
		g.fillOval(233, 95, 29, 29);
		g.fillOval(235, 96, 31, 31);
		g.fillOval(237, 95, 11, 11);
		g.fillOval(238, 94, 13, 13);
		g.fillOval(239, 93, 15, 15);
		g.fillOval(240, 94, 19, 19);
		g.fillOval(241, 92, 21, 21);
		g.fillOval(242, 91, 25, 25);

		g.setColor(Color.DARK_GRAY);
		g.fillRect(220, 120, 20, 80);

		// Draws the roof
		int xPoints[] = { 75, 175, 275 };
		int yPoints[] = { 200, 100, 200 };
		g.setColor(new Color(139, 69, 19));
		g.fillPolygon(xPoints, yPoints, 3);

		// Writes "Welcome Home" on the base of the roof
		g.setColor(new Color(0, 250, 154));
		g.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 20));
		g.drawString("Welcome Home", 101, 198);
	}

	// Draws the clouds
	
	/**
	 * 
	 * @param g the Graphics object
	 * @param x the x-coordinate of the top-left corner of the cloud
	 * @param y the y-coordinate of the top-left corner of the cloud
	 * @param width the Width of the cloud
	 * @param height the Height of the cloud
	 */
	
	public void drawCloud(Graphics g, int x, int y, int width, int height) {
		//Top circle in cloud
		g.fillOval(x - width / 2, y - (width * (11 / 10)), width, height);
		
		//Middle row of cloud
		g.fillOval(x, y - (height / 2), width, height);
		g.fillOval(x - (width / 2), y - (height / 2), width, height);
		g.fillOval(x - 2*width + 10, y + (height / 20), width, height);
		g.fillOval(x - width, y - (height / 2), width, height);
		
		//Bottom row of cloud
		g.fillOval(x, y, width, height);
		g.fillOval(x - (width / 5), y, width, height);
		g.fillOval(x - (width * (11/10)), y, width, height);

		//Cloud cloud = new Cloud (190, 40, 40, 40);
		//cloud.draw(g);		 
		//		for (int k = 0; k <= 375; k += 24) {
		//			g.setColor(Color.white);
		//			g.fillOval(k, 40, 23, 20);
		//		}	
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome Home");
		frame.setBackground(new Color(4, 156, 249));
		frame.setSize(400, 400);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Lab01());
		frame.setVisible(true);
	}
}