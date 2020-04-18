import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.*;

@SuppressWarnings("serial")
public class RandomSquares extends JPanel {

	static Random numberGen = new Random();
	private BufferedImage design;
	private Timer t;

	// int r2 = (int) Math.floor(Math.random() * 255) + 1;
	// int g2 = (int) Math.floor(Math.random() * 255) + 1;
	// int b2 = (int) Math.floor(Math.random() * 255) + 1;

	public RandomSquares() {

		design = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
		Graphics g = design.getGraphics();
		 long startTime = System.currentTimeMillis();

		for (int x = 0; x < 500; x += 10) {
			for (int y = 0; y < 500; y += 10) {
				int rVal = numberGen.nextInt(255) + 1;
				int gVal = numberGen.nextInt(255) + 1;
				int bVal = numberGen.nextInt(255) + 1;

				g.setColor(new Color(rVal, gVal, bVal));
				g.fillRect(x, y, 10, 10);
				System.out.println("The RGB Value is (" + rVal + ", " + gVal + ", " + bVal + ")");
			}
		}

		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime) / 1000;
		System.out.println("This program ran for " + totalTime + " seconds.");
		
//		t = new Timer(1000, new Listener());
//		t.start();
	}
	
//	private class Listener implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			for (int x = 0; x < 500; x += 10) {
//				for (int y = 0; y < 500; y += 10) {
//					int rVal = numberGen.nextInt(255) + 1;
//					int gVal = numberGen.nextInt(255) + 1;
//					int bVal = numberGen.nextInt(255) + 1;
//
//					g.setColor(new Color(rVal, gVal, bVal));
//					g.fillRect(x, y, 10, 10);
//					System.out.println("The RGB Value is (" + rVal + ", " + gVal + ", " + bVal + ")");
//				}
//			}
//			
//			repaint();
//		}
//	}

	public void paintComponent(Graphics g) {
		g.drawImage(design, 0, 0, getWidth(), getHeight(), null);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Random Color");
		frame.setBackground(Color.black);
		frame.setSize(500, 500);
		//frame.setLocation(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new RandomSquares());
		frame.setVisible(true);
	}
}