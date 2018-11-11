package states;

import javafx.scene.canvas.GraphicsContext;
import res.Images;

public class GameState extends State {
	
	@Override 
	public void tick() {
		
	}
	
	@Override
	public void render(GraphicsContext gc) {
		gc.drawImage(Images.borderTile, 0, 0);
	}
	
}
