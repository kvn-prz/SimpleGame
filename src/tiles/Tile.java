package tiles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Tile {
	
	//tile properties
	private double width;
	private double height;
	private double xPos;
	private double yPos;
	private int type;
	
//	TYPES OF TILES:
//	0=BORDER
//	1=GRASS
	
	private Image border;
	private Image grass;
	private Image dirt;
	private Image dirtHole;

	public Tile(double width, double height, double xPos, double yPos, int type) {
		this.width = width;
		this.height = height;
		this.xPos = xPos;
		this.yPos = yPos;
		this.type = type;
		grass = new Image("/res/grass.png");
		border = new Image("/res/border.png");
		dirt = new Image("/res/dirt.png");
		dirtHole = new Image("/res/dirt-hole.png");
	}
	
	public void render(GraphicsContext gc, int type) {
		if(type == 0) gc.drawImage(border, this.getXpos(), this.getYpos());
		if(type == 1) gc.drawImage(grass, this.getXpos(), this.getYpos());
		if(type == 2) gc.drawImage(dirt, this.getXpos(), this.getYpos());
		if(type == 3) gc.drawImage(dirtHole, this.getXpos(), this.getYpos());
	}
	
	//getters
	public double getXpos() {return this.xPos;}
	public double getYpos() {return this.yPos;}
	public int getType() {return this.type;}
}
