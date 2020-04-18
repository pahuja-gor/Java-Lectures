import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Flickering Colors");
		setResizable(true);
		setSize(400, 400);
		setLocationRelativeTo(null);

		init();
	}

	public void init() {
		setLayout(new GridLayout(1, 1, 0, 0));

		Draw d = new Draw();
		add(d);

		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
	}

}
