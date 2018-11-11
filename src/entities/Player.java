package entities;

import inputHandler.KeyboardInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import main.Handler;
import res.Images;

public class Player {
	
	//player properties
	private final double PLAYER_WIDTH = 80;
	private final double PLAYER_HEIGHT = 80;
	private double xPos;
	private double yPos;
	private double speed = 5;	
	private Image playerImage;
	
	//handler
	private Handler handler;
	
	//constructor
	public Player(Handler handler) {
		this.xPos = handler.getWidth()/2;
		this.yPos = handler.getHeight() - 180;
		this.handler = handler;
		this.playerImage = Images.player[0];
	}
	
	//player movement
	public void tick() {
		movePlayer();
		checkCollision();
	}
	
	public void movePlayer() {
		//move right
		if(handler.getKeyInput().isRight()) {
			if(this.getXpos() + this.getSpeed() > handler.getWidth() - PLAYER_WIDTH) this.setXpos(handler.getWidth() - PLAYER_WIDTH);
			else this.setXpos(this.getXpos() + this.getSpeed());}
		
		//move left
		if(handler.getKeyInput().isLeft()) {
			if(this.getXpos() - this.getSpeed() < 0) this.setXpos(0);
			else this.setXpos(this.getXpos() - this.getSpeed());}
		
		//move up
		if(handler.getKeyInput().isUp()) {
			if(this.getYpos() - this.getSpeed() < 0) this.setYpos(0);
			else this.setYpos(this.getYpos() - this.getSpeed());}
		
		//move down
		if(handler.getKeyInput().isDown()) {
			if(this.getYpos() + this.getSpeed() > handler.getHeight() - PLAYER_HEIGHT) this.setYpos(handler.getHeight() - PLAYER_HEIGHT);
			else this.setYpos(this.getYpos() + this.getSpeed());}}
	
	public void checkCollision() {
		//TODO
	}
	
	//render
	public void render(GraphicsContext gc) {
		gc.drawImage(playerImage, xPos, yPos);
	}
	
	//setters
	public void setSpeed(double speed) {this.speed = speed;}
	public void setXpos(double xPos) {this.xPos = xPos;}
	public void setYpos(double yPos) {this.yPos = yPos;}
	
	//getters
	public double getSpeed() {return this.speed;}
	public double getXpos() {return this.xPos;}
	public double getYpos() {return this.yPos;}
	public KeyboardInput getInput() {return handler.getKeyInput();}
}