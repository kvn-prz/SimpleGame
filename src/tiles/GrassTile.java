package tiles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import res.Images;

public class GrassTile extends Tile {
	
	private Image texture;
	
	public GrassTile(float xPos, float yPos) {
		super(xPos, yPos);
		this.texture = Images.grassTile;		
	}
	
	@Override
	public void render(GraphicsContext gc) {
		gc.drawImage(texture, xPos, yPos);
	}
	
}
