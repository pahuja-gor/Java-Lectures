import java.awt.Color;
import java.awt.Graphics;

public class Block {

	public static int blockSize = 20;
	private int x, y, R, G, B;
	
	public Block(int x, int y, int R, int G, int B) {
		this.x = x;
		this.y = y;
		this.R = R;
		this.G = G;
		this.B = B;
	}
	
	public void draw(Graphics g) {
		g.setColor(new Color(R, G, B));
		g.fillRect(x * blockSize, y * blockSize, blockSize, blockSize);
	}
	
	public void setColor(int R, int G, int B) {
		this.R = R;
		this.G = G;
		this.B = B;
	}
	
}
