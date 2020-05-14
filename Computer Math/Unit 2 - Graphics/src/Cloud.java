import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cloud {

	private int x;
	private int y;
	private int height;
	private int width;
	
	public Cloud(int cloudX, int cloudY, int cloudHeight, int cloudWidth) {
		x = cloudX;
		y = cloudY;
		height = cloudHeight;
		width = cloudWidth;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		Color neonPurple = new Color (184, 79, 255);
		g2.setColor(neonPurple);
		
		g2.fillOval(x, y, width, height);
		g2.fillOval(x - (width * (11/10)), y, width, height);		
		g2.fillOval(x - (width / 5), y, width, height);
		g2.fillOval(x - width / 2, y - (width * (11 / 10)), width, height);
		g2.fillOval(x, y - (height / 2), width, height);
		g2.fillOval(x - (width / 2), y - (height / 2), width, height);
		g2.fillOval(x - 2*width + 10, y + (height / 20), width, height);
		g2.fillOval(x - width, y - (height / 2), width, height);
	}

}
