package tiles;

import javafx.scene.canvas.GraphicsContext;

public class Tile {
	
	protected float xPos;
	protected float yPos;
	public static final float TILEWIDTH = 64;
	public static final float TILEHEIGHT = 64;
	protected boolean isSolid;
	
	public Tile(float xPos, float yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.isSolid = false;
	}
	
	public void render(GraphicsContext gc) {}
	
}
