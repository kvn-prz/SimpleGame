package tiles;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Tile {
	
	protected Image texture;
	protected final int id;
	
	public static final int TILEWIDTH = 64;
	public static final int TILEHEIGHT = 64;
	
	//global static stuff
	public static Tile[] tiles = new Tile[5];	
	public static Tile grassTile = new GrassTile(0);
	public static Tile stoneTile = new StoneTile(1);
	
	
	public Tile(Image texture, int id) {
		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}
	
	public void render(GraphicsContext gc, int xPos, int yPos) {
		gc.drawImage(texture, xPos, yPos, TILEWIDTH, TILEHEIGHT);
	}
	
	//getters
	public int getId() {return this.id;}
	public boolean isSolid() {return false;}
	
}
