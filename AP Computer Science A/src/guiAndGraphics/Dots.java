package guiAndGraphics;

import java.awt.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


@SuppressWarnings("serial")
public class Dots extends JPanel{

	private final int WIDTH = 800, HEIGHT = 600;
	private final int RADIUS = 6;

	private List<Point> pointList;
	private int count;
	//	private Color color[];

	public Dots() {
		pointList = new ArrayList<Point>();
		count = 0;

		addMouseListener(new DotsListener());

		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Color[] color = {Color.BLUE, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
		for (int x = 0; x < pointList.size(); x ++) {
			Random r = new Random();
			int y = ThreadLocalRandom.current().nextInt(0, (color.length - 1) + 1);
			g.setColor(color[y]);
		}
		int x = 0;
		for (Point point : pointList)
		{	
			int z = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			if (z == 1)
				g.fillRect(point.x, point.y, RADIUS * (2+x), RADIUS * (x));
			else if (z == 2)
				g.fillRoundRect(point.x, point.y, RADIUS * (2+x), RADIUS * (2+x), RADIUS + x, RADIUS + x);
			else if (z == 3)
				g.fillOval(point.x - RADIUS, point.y - RADIUS, RADIUS * (2+x), RADIUS * (2+x));
			x++;
		}

		g.setFont(new Font("Arial", Font.PLAIN, 40));
		g.drawString("Count: " + count, 5, 45);		// the (x,y) coordinate is from the bottom-left of the text
	}

	private class DotsListener implements MouseListener {

		@Override
		public void mousePressed(MouseEvent event) {
//			if (event.isMetaDown()) {
			pointList.add(event.getPoint());
			count++;
			repaint();
//			}
		}


		public void mouseClicked(MouseEvent e) {
//			if (e.isMetaDown() && e.isControlDown()) {
				pointList.remove(e.getPoint());
				count--;
				repaint();
//			}
		}
		public void mouseEntered(MouseEvent e) {

		}
		public void mouseExited(MouseEvent e) {

		}
		public void mouseReleased(MouseEvent e) {

		}


	}

	public static void main(String[] args) {

		JFrame dotsFrame = new JFrame("Dots");
		dotsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		dotsFrame.getContentPane().add(new Dots());

		dotsFrame.pack();
		dotsFrame.setVisible(true);

	}

}