package states;

import entities.Player;
import javafx.scene.canvas.GraphicsContext;
import main.Game;
import main.Handler;
import res.Images;

public class GameState extends State {
	
	private Player player;
	
	public GameState(Handler handler) {
		super(handler);
		player = new Player(handler);
	}

	@Override 
	public void tick() {
		handler.getGame().getKeyManager().tick(handler.getGame().getScene());
		player.tick();
	}
	
	@Override
	public void render(GraphicsContext gc) {
		gc.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
		player.render(gc);
	}
	
}
