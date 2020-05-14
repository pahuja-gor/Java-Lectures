import java.awt.Color;
import java.awt.Graphics;

public class Tree {

	private int x;
	private int y;
	private int width;
	private int height;
	
	/**
	 * Creates a tree with the base centered at (treeX, treeY) with a
	 * given treeWidth and treeHeight
	 * @param treeX the x-coordinate in the top-left corner
	 * @param treeY the y-coordinate in the top-left corner
	 * @param treeHeight the height of the tree object
	 * @param treeWidth the width of the tree object
	 */
	public Tree(int treeX, int treeY, int treeWidth, int treeHeight) {
		x = treeX;
		y = treeY;
		height = treeHeight;
		width = treeWidth;
	}
	
	/**
	 * Draws a tree
	 * @param g the Graphics object
	 */
	public void draw(Graphics g) {
		
		Color brown = new Color(139, 69, 19);
		g.setColor(brown); 
		g.fillRect(x + width / 4, y + height / 4, width / 2, height * 3 / 4);
		
		g.setColor(Color.GREEN.darker());
		g.fillOval(x, y, width , height / 2);
		
			
	}
	
}