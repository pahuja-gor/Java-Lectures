import java.awt.Color;
import java.awt.Graphics;

public class Window {

	private int x;
	private int y;
	private int height;
	private int width;
	
	/**
	 * 
	 * @param windowX the x-coordinate of the top left corner of the window
	 * @param windowY the y-coordinate of the top left corner of the window
	 * @param windowHeight the height of the window
	 * @param windowWidth the width of the window
	 */
	
	public Window(int windowX, int windowY, int windowHeight, int windowWidth) {
		x = windowX;
		y = windowY;
		height = windowHeight;
		width = windowWidth;
	}
	
	public void draw(Graphics g) {
		Color skyBlue = new Color (135, 206, 250);
		g.setColor(skyBlue);
		//Creates the glass pane
		g.fillRect(x, y, width, height);
		g.setColor(Color.black);
		//Creates the cross section
		g.drawLine(x, y + height / 2, x + width, y + height / 2);
		g.drawLine(x + width / 2, y, x + width / 2, y + width);
	}

}