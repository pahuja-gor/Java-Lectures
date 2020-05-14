import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("serial")
public class ProjectRoom extends JPanel {

	private static final int HEIGHT = 600;
	private static final int WIDTH = 800;

	private BufferedImage design;

	public ProjectRoom() {

		// Using a BufferedImage, your entire graphic design will
		// assume a size of WIDTH x HEIGHT
		design = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics g = design.getGraphics();

		// Creates the floor made out of hardwood
		g.setColor(Color.white);
		g.fillRect(100, 100, 600, 480);
		ImageIcon carpet = new ImageIcon("wood.jpg");
		g.drawImage(carpet.getImage(), 100, 100, 600, 480, null);

		// Creates the Closet Door
		g.setColor(Color.green);
		g.fillArc(55, 6, 90, 185, -30, -60);
		g.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 17));
		g.setColor(Color.white);
		g.drawString("Closet Door", 135, 160);

		// Creates the closet
		g.setColor(Color.blue.brighter());
		g.fillRect(0, 100, 100, 90);
		g.setColor(Color.white);
		g.drawString("The Closet", 0, 140);

		// Creates the bathroom
		g.setColor(Color.blue.brighter());
		g.fillRect(277, 30, 110, 70);
		g.setColor(Color.yellow);
		g.drawString("Bathroom", 285, 70);

		// Creates the bathroom door
		g.setColor(Color.GREEN);
		g.fillArc(168, 60, 220, 80, 0, -45);
		g.setColor(Color.orange);
		g.drawString("Bathroom Door", 275, 140);

		// Creates the window that is on the top of the screen
		g.setColor(new Color(0, 191, 255));
		g.fillRect(500, 100, 90, 15);
		g.setColor(Color.BLACK);
		g.drawLine(500, 108, 500+90, 108);
		g.drawLine(545, 100, 545, 115);
		g.setColor(Color.red);
		g.drawString("Window", 510, 130);

		// Creates the dresser/chest
		int xPoints[] = { 600, 620, 700, 680 };
		int yPoints[] = { 130, 100, 150, 180 };
		g.setColor(new Color(139, 69, 19));
		g.fillPolygon(xPoints, yPoints, 4);
		g.setColor(Color.cyan);
		g.drawString("Chest", 615, 140);

		// Creates the bed
		g.setColor(Color.red);
		g.fillRect(520, 230, 180, 150);
		ImageIcon bed = new ImageIcon("Bed.png");
		g.drawImage(bed.getImage(), 520, 230, 180, 150, null);
		g.setColor(Color.green);
		g.drawString("Bed", 560, 305);

		// Creates the window that is on the right side of the screen
		g.setColor(new Color(0, 191, 255));
		g.fillRect(685, 430, 15, 90);
		g.setColor(Color.orange);
		g.drawString("Window", 640, 430);
		g.setColor(Color.black);
		g.drawLine(685, 430+45, 685+15, 430+45);
		g.drawLine(685+8, 430, 685+8, 520);
											
		// Creates the desk
		g.setColor(Color.orange);
		g.fillRect(320, 480, 200, 100);
		g.setColor(Color.white);
		g.drawString("Desk", 390, 515);
		ImageIcon Mac = new ImageIcon("Mac.jpg");
		g.drawImage(Mac.getImage(), 420, 530, 100, 50, null);

		// Creates the chair
		ImageIcon chair = new ImageIcon("Sofa.png");
		g.drawImage(chair.getImage(), 375, 418, 100, 50, null);
		g.setColor(Color.red);
		g.drawString("Chair", 400, 440);

		// Creates the TV
		ImageIcon TV = new ImageIcon("TV.jpg");
		g.drawImage(TV.getImage(), 110, 270, 40, 100, null);
		g.setColor(Color.red);
		g.drawString("TV", 155, 330);

		// Creates two side tables
		g.setColor(Color.red);
		int xPoints2[] = { 565, 625, 640, 625, 565, 550 };
		int yPoints2[] = { 480, 480, 520, 560, 560, 520 };

		for (int i = 0, j = 0; i < 2; i++, j -= 350) {
			xPoints2[0] += j;
			xPoints2[1] += j;
			xPoints2[2] += j;
			xPoints2[3] += j;
			xPoints2[4] += j;
			xPoints2[5] += j;
			drawPolygon(g, xPoints2, yPoints2);
		}
		for (int x = 555; x >= 205; x -= 350) {
			g.setColor(Color.green);
			g.drawString("Side Table", x, 520);
		}

		// Creates the rug
		g.setColor(new Color(238, 130, 238));					//g.setColor(Color.red);
		g.fillOval(230, 200, 200, 200);
		g.setColor(new Color(75, 0, 130));						//g.setColor(Color.orange);
		g.fillOval(240, 210, 180, 180);
		g.setColor(Color.blue);									//g.setColor(Color.yellow);
		g.fillOval(250, 220, 160, 160);
		g.setColor(Color.green);								//g.setColor(Color.green);
		g.fillOval(260, 230, 140, 140);
		g.setColor(Color.yellow);								//g.setColor(Color.blue);
		g.fillOval(270, 240, 120, 120);	
		g.setColor(Color.orange);								//g.setColor(new Color(75, 0, 130));
		g.fillOval(280, 250, 100, 100);
		g.setColor(Color.red);									//g.setColor(new Color(238, 130, 238));
		g.fillOval(290, 260, 80, 80);
		g.setColor(Color.BLACK);
		g.drawString("Rug", 315, 305);
	}

	public void drawPolygon(Graphics g, int[] xPoints, int[] yPoints) {
		g.fillPolygon(xPoints, yPoints, 6);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(design, 0, 0, getWidth(), getHeight(), null);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Project - Goral's Bedroom"); // Include your name
		frame.setSize(800, 700); // You may need to change the size of your frame
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ProjectRoom());
		frame.setVisible(true);

	}

}