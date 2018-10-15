package Entities;

import InputHandler.KeyboardInput;
import Main.Game;
import Main.Handler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player {
	
	//player properties
	private final double PLAYER_WIDTH = 80;
	private final double PLAYER_HEIGHT = 80;
	private double xPos;
	private double yPos;
	private final Color PLAYER_COLOR = Color.RED;
	private double speed = 20;
	
	//handler
	private Handler handler;
	
	//constructor
	public Player(Handler handler) {
		this.xPos = Game.WIDTH/2;
		this.yPos = Game.HEIGHT - 100;
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
			if(this.getXpos() + this.getSpeed() > handler.getWidth() - PLAYER_WIDTH) this.setXpos(handler.getWidth() - PLAYER_WIDTH);
			else this.setXpos(this.getXpos() + this.getSpeed());
		}
		//move left
		if(handler.getKeyInput().isLeft()) {
			if(this.getXpos() - this.getSpeed() < 0) this.setXpos(0);
			else this.setXpos(this.getXpos() - this.getSpeed());
		}
			
		//move up
		if(handler.getKeyInput().isUp()) {
			if(this.getYpos() - this.getSpeed() < 0) this.setYpos(0);
			else this.setYpos(this.getYpos() - this.getSpeed());
		}
		//move down
		if(handler.getKeyInput().isDown()) {
			if(this.getYpos() + this.getSpeed() > handler.getHeight() - PLAYER_HEIGHT) this.setYpos(handler.getHeight() - PLAYER_HEIGHT);
			else this.setYpos(this.getYpos() + this.getSpeed());
		}
	}
	
	public void checkCollision() {
		//TODO
	}
	
	//render
	public void render(GraphicsContext gc) {
		gc.setFill(PLAYER_COLOR);
		gc.fillRect(this.getXpos(), this.getYpos(), PLAYER_WIDTH, PLAYER_HEIGHT);
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
