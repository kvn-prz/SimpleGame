package states;

import areas.Area;
import entities.Player;
import javafx.scene.canvas.GraphicsContext;
import main.Game;
import main.Handler;
import res.Images;
import tiles.Tile;

public class GameState extends State {
	
	private Player player;
	private Area area;
	
	public GameState(Handler handler) {
		super(handler);
		area = new Area("src/res/areas/area1.txt");
		player = new Player(handler);
		player.setXpos(area.getSpawnX()*Tile.TILEWIDTH);
		player.setYpos(area.getSpawnY()*Tile.TILEHEIGHT);
		
	}

	@Override 
	public void tick() {
		handler.getGame().getKeyManager().tick(handler.getGame().getScene());
		player.tick();
	}
	
	@Override
	public void render(GraphicsContext gc) {
		gc.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
		area.render(gc);
		player.render(gc);
		
	}
	
}
