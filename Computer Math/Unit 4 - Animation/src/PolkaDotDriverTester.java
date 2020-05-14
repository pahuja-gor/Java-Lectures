// Driver10Tester.java
//
// Tests the get and set methods in the Polkadot class

import javax.swing.JFrame;

public class PolkaDotDriverTester
{
	public static void main(String[] args)
	{ 
		JFrame frame = new JFrame("Lab10: Polka Dot Tester");
		frame.setSize(800, 800);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PolkaDotPanelTester());
		frame.setVisible(true);
	}
}

// Should produce 4 polkadots in the new JFrame
//
//
// Expected output in the Run I/O tab below:
//  x: 200.0
//  y: 200.0
//  color: java.awt.Color[r=255,g=0,b=0]
//  diameter: 25.0
//  radius: 12.5