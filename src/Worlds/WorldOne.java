package Worlds;

import Entities.Player;
import InputHandler.KeyboardInput;
import Main.Handler;
import javafx.scene.canvas.GraphicsContext;

public class WorldOne extends WorldBase {
	
	private Player player;
	
	public WorldOne(Handler handler) {
		super(handler);
		this.player = new Player(handler);
	}

	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(GraphicsContext gc) {
		player.render(gc);
	}
	
	
	
	
}
