package entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import main.Handler;
import res.Images;

public class Player {
	
	//player properties
	private final double PLAYER_WIDTH = 80;
	private final double PLAYER_HEIGHT = 80;
	private double xPos;
	private double yPos;
	private double speed = 7;	
	
	//handler
	private Handler handler;
	
	//constructor
	public Player(Handler handler) {
		this.xPos = handler.getWidth()/2;
		this.yPos = handler.getHeight() - 180;
		this.handler = handler;
	}
	
	//player movement
	public void tick() {
		movePlayer();
		checkCollision();
	}
	
	public void movePlayer() {
		if(handler.getGame().getKeyManager().isUp()) yPos -= speed;
		else if(handler.getGame().getKeyManager().isDown()) yPos += speed;
		if(handler.getGame().getKeyManager().isLeft()) xPos -= speed;
		else if(handler.getGame().getKeyManager().isRight()) xPos += speed;
	}
	
	public void checkCollision() {
		//TODO
	}
	
	//render
	public void render(GraphicsContext gc) {
		gc.drawImage(Images.player, xPos, yPos);
	}
	
	//setters
	public void setSpeed(double speed) {this.speed = speed;}
	public void setXpos(double xPos) {this.xPos = xPos;}
	public void setYpos(double yPos) {this.yPos = yPos;}
	
	//getters
	public double getSpeed() {return this.speed;}
	public double getXpos() {return this.xPos;}
	public double getYpos() {return this.yPos;}
}