package Entities;

import InputHandler.KeyboardInput;
import Main.Handler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Player {
	
	//player properties
	private final double PLAYER_WIDTH = 80;
	private final double PLAYER_HEIGHT = 80;
	private double xPos;
	private double yPos;
	private double speed = 5;
	private Image player = new Image("/res/player.png");
	
	//player images
	private final Image playerBack = new Image("/res/player.png");
	private final Image playerFront = new Image("/res/player-front.png");
	private final Image playerRside = new Image("/res/player-Rside.png");
	private final Image playerLside = new Image("/res/player-Lside.png");
	
	
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
		//move right
		if(handler.getKeyInput().isRight()) {
			player = playerRside;
			if(this.getXpos() + this.getSpeed() > handler.getWidth() - PLAYER_WIDTH) this.setXpos(handler.getWidth() - PLAYER_WIDTH);
			else this.setXpos(this.getXpos() + this.getSpeed());}
		
		//move left
		if(handler.getKeyInput().isLeft()) {
			player = playerLside;
			if(this.getXpos() - this.getSpeed() < 0) this.setXpos(0);
			else this.setXpos(this.getXpos() - this.getSpeed());}
		
		//move up
		if(handler.getKeyInput().isUp()) {
			player = playerBack;
			if(this.getYpos() - this.getSpeed() < 0) this.setYpos(0);
			else this.setYpos(this.getYpos() - this.getSpeed());}
		
		//move down
		if(handler.getKeyInput().isDown()) {
			player = playerFront;
			if(this.getYpos() + this.getSpeed() > handler.getHeight() - PLAYER_HEIGHT) this.setYpos(handler.getHeight() - PLAYER_HEIGHT);
			else this.setYpos(this.getYpos() + this.getSpeed());}}
	
	public void checkCollision() {
		//TODO
	}
	
	//render
	public void render(GraphicsContext gc) {
		gc.drawImage(player, xPos, yPos);
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


//private double jumpCount = 10;
//private boolean jumping = false;





////jump
//if(!this.isJumping() && handler.getKeyInput().isJump()) this.setJumping(true);
//if(this.isJumping()) jump();}

//public void jump() {
//double neg;
//if(this.jumpCount >= -10) {
//	neg = 1;
//	if(this.jumpCount < 0) neg = -1;
//	
//	this.setYpos(this.getYpos()-(Math.pow(this.jumpCount, 2))*0.4*neg);
//	this.jumpCount--;}
//else {
//	this.setJumping(false);
//	this.jumpCount = 10;}}

