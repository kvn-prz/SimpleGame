package worlds;
 
import java.util.ArrayList;

import entities.Player;
import inputHandler.KeyboardInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import main.Handler;
import tiles.Tile;

public class WorldOne extends WorldBase {
	
	private Player player;
	private ArrayList<Tile> tileList;
	
	//tile map
	private int[][] tileMap = new int[][] {
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
		{0,2,2,2,1,1,1,1,1,1,1,1,1,1,0},
		{0,2,3,2,1,1,1,1,1,1,1,1,1,1,0},
		{0,2,2,2,1,1,1,1,1,1,1,1,1,1,0},
		{0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
		{0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
		{0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
		
	public WorldOne(Handler handler) {
		super(handler);
		this.player = new Player(handler);
		tileList = new ArrayList<>();
		makeMap();
	}

	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(GraphicsContext gc) {
		for(Tile tile: tileList) {
			tile.render(gc, tile.getType());
		}
		player.render(gc);
	}
	
	@Override
	public Player getPlayer() {return this.player;}
	
	public ArrayList<Tile> makeMap(){
		for(int y=0; y<9; y++) {
			for(int x=0; x<15; x++) {
				Tile tile = new Tile(80,80,x*80,y*80, tileMap[y][x]);
				this.tileList.add(tile);
			}
		}
		return this.tileList;
	}
	
	
	
}
