// PolkaDotPanelTester.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

@SuppressWarnings("serial")
public class PolkaDotPanelTester extends JPanel
{
	private static final int FRAME = 800;   
	private static final Color BACKGROUND = Color.black;

	private BufferedImage myImage;
	private Graphics myBuffer;
	private Timer timer;
	private Polkadot pd1, pd2, pd3, pd4;
	private int xPos, yPos;


	public PolkaDotPanelTester()
	{
		myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();

		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, FRAME, FRAME);

		pd1 = new Polkadot();
		pd2 = new Polkadot(300, 400, 50, Color.CYAN);
		pd3 = new Polkadot();
		pd4 = new Polkadot();

		getInfo(pd1);

		timer = new Timer(1000, new Listener());
		timer.start();
	}


	public void paintComponent(Graphics g)
	{
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}


	public void getInfo(Polkadot polkadot)
	{
		System.out.println("x: " + polkadot.getX());
		System.out.println("y: " + polkadot.getY());
		System.out.println("color: " + polkadot.getColor());
		System.out.println("diameter: " + polkadot.getDiameter());
		System.out.println("radius: " + polkadot.getRadius());
	}


	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			pd1.draw(myBuffer);
			pd2.draw(myBuffer);

			pd3.setX(600);
			pd3.setY(600);
			pd3.setColor(Color.YELLOW);
			pd3.setRadius(50);
			pd3.draw(myBuffer);

			pd4.setX(600);
			pd4.setY(150);
			pd4.setDiameter(300);
			pd4.setColor(Color.GREEN);
			pd4.draw(myBuffer);

			repaint();
		}
	}
}