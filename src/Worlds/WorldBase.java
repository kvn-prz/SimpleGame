package Worlds;

import Entities.Player;
import Main.Handler;
import javafx.scene.canvas.GraphicsContext;

public abstract class WorldBase {
	
	private Handler handler;
	
	
	public WorldBase(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick();
	public abstract void render(GraphicsContext gc);
	
	//getter
	public abstract Player getPlayer();
}
