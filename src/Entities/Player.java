package Entities;

import InputHandler.KeyboardInput;
import Main.Game;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player {
	
	//player properties
	private final double PLAYER_WIDTH = 80;
	private final double PLAYER_HEIGHT = 80;
	private double xPos;
	private double yPos;
	private final Color PLAYER_COLOR = Color.RED;
	private String direction;
	private double speed = 20;
	
	//input
	KeyboardInput input;
	
	//constructor
	public Player(KeyboardInput input) {
		this.input = input;
		this.xPos = Game.WIDTH/2;
		this.yPos = Game.HEIGHT - 100;
	}
	
	//player movement
	public void tick() {
		movePlayer();
		checkCollision();
	}
	
	public void movePlayer() {
		//move right
		if(this.getInput().isRight()) {
			if(this.getXpos() + this.getSpeed() > Game.WIDTH - PLAYER_WIDTH) this.setXpos(Game.WIDTH - PLAYER_WIDTH);
			else this.setXpos(this.getXpos() + this.getSpeed());
		}
		//move left
		if(this.getInput().isLeft()) {
			if(this.getXpos() - this.getSpeed() < 0) this.setXpos(0);
			else this.setXpos(this.getXpos() - this.getSpeed());
		}
			
		//move up
		if(this.getInput().isUp()) {
			if(this.getYpos() - this.getSpeed() < 0) this.setYpos(0);
			else this.setYpos(this.getYpos() - this.getSpeed());
		}
		//move down
		if(this.getInput().isDown()) {
			if(this.getYpos() + this.getSpeed() > Game.HEIGHT - PLAYER_HEIGHT) this.setYpos(Game.HEIGHT - PLAYER_HEIGHT);
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
	public void setDirection(String direction) {this.direction = direction;}
	public void setSpeed(double speed) {this.speed = speed;}
	public void setXpos(double xPos) {this.xPos = xPos;}
	public void setYpos(double yPos) {this.yPos = yPos;}
	
	//getters
	public String getDirection() {return this.direction;}
	public double getSpeed() {return this.speed;}
	public double getXpos() {return this.xPos;}
	public double getYpos() {return this.yPos;}
	public KeyboardInput getInput() {return this.input;}
}
