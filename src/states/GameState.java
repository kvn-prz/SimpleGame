package states;

import entities.Player;
import javafx.scene.canvas.GraphicsContext;
import main.Handler;
import res.Images;


public class GameState extends State {
	
	public static Player e;
	
	public GameState(Handler handler) {
		super(handler);
		e = new Player(handler);
	}

	@Override 
	public void tick() {
		handler.getGame().getKeyManager().tick(handler.getGame().getScene());
		e.tick();
	}
	
	@Override
	public void render(GraphicsContext gc) {
		gc.drawImage(Images.gameBG, 0, 0);
		e.render(gc);
	}	
}
