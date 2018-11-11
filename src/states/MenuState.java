package states;

import javafx.scene.canvas.GraphicsContext;
import res.Images;

public class MenuState extends State {
	
	@Override
	public void tick() {
				
	}

	@Override
	public void render(GraphicsContext gc) {
		gc.drawImage(Images.menuBG, 0, 0);
	}
	
}
