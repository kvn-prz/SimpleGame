package areas;

import javafx.scene.canvas.GraphicsContext;
import tiles.Tile;
import utils.Util;

public class Area {
	
	private int width;
	private int height;
	private int spawnX;
	private int spawnY;
	private int[][] map;
	
	public Area(String path) {
		loadArea(path);
	}
	
	public void tick() {}
	
	public void render(GraphicsContext gc) {
		for(int y = 0; y<height; y++) {
			for(int x = 0; x<width; x++) {
				getTile(x, y).render(gc, x*Tile.TILEWIDTH, y*Tile.TILEHEIGHT);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		Tile t = Tile.tiles[map[x][y]];
		if(t == null) return Tile.grassTile;
		return t;
	}
	
	private void loadArea(String path) {
		String file = Util.loadFile(path);
		String[] tokens = file.split("\\s+");
		width = Util.parseInt(tokens[0]);
		height = Util.parseInt(tokens[1]);
		spawnX = Util.parseInt(tokens[2]);
		spawnY = Util.parseInt(tokens[3]);
		
		map = new int[width][height];
		for(int y = 0; y<height; y++) {
			for(int x = 0; x<width; x++) {
				map[x][y] = Util.parseInt(tokens[(x+y*width)+4]);
			}
		}
	}
	
	//getters
	public int getSpawnX() {return this.spawnX;}
	public int getSpawnY() {return this.spawnY;}
}
