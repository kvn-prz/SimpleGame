package Worlds;

import Entities.Player;
import InputHandler.KeyboardInput;
import javafx.scene.canvas.GraphicsContext;

public class WorldOne {
	
	private Player player;
	
	public WorldOne(KeyboardInput input) {
		player = new Player(input);
	}
	
	public void tick() {
		player.tick();
	}
	public void render(GraphicsContext gc) {
		player.render(gc);
	}
	
	//getters
	public Player getPlayer() {return this.player;}
}
