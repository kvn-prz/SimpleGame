package entities;

import javafx.scene.canvas.GraphicsContext;
import main.Handler;
import res.Animation;
import res.Images;

public class Player {
	
	//player properties
	private final double PLAYER_WIDTH = 80;
	private final double PLAYER_HEIGHT = 80;
	private double xPos;
	private double yPos;
	private double speed = 4;
	private int direction = 0;
	private boolean moving = false;
	
	//animation
	private int animSpeed = 150;
	private Animation animDown;
	private Animation animUp;
	private Animation animLeft;
	private Animation animRight;
	
	//handler
	private Handler handler;
	
	//constructor
	public Player(Handler handler) {
		this.xPos = handler.getWidth()/2;
		this.yPos = handler.getHeight() - 180;
		this.handler = handler;
		
		animDown = new Animation(animSpeed, Images.playerFront);
		animUp = new Animation(animSpeed, Images.playerUp);
		animLeft = new Animation(animSpeed, Images.playerLeft);
		animRight = new Animation(animSpeed, Images.playerRight);
	}
	
	//player movement
	public void tick() {
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		movePlayer();
		checkCollision();
	}
	
	public void movePlayer() {
		//up
		if(handler.getGame().getKeyManager().isUp()) {
			moving = true;
			direction = 1;
			yPos -= speed;
		}
		//down
		else if(handler.getGame().getKeyManager().isDown()) {
			moving = true;
			direction = 2;
			yPos += speed;
		}
		//left
		else if(handler.getGame().getKeyManager().isLeft()) {
			moving = true;
			direction = 3;
			xPos -= speed;
		}
		//right
		else if(handler.getGame().getKeyManager().isRight()) {
			moving = true;
			direction = 4;
			xPos += speed;
		}
		else direction = 0;
		
	}
	
	public void checkCollision() {
		//TODO
	}
	
	//render
	public void render(GraphicsContext gc) {
		switch (direction) {
			case 0: gc.drawImage(animDown.getFirstFrame(), xPos, yPos); break;
			case 1: gc.drawImage(animUp.getCurrentFrame(), xPos, yPos); break;
			case 2: gc.drawImage(animDown.getCurrentFrame(), xPos, yPos); break;
			case 3: gc.drawImage(animLeft.getCurrentFrame(), xPos, yPos); break;
			case 4: gc.drawImage(animRight.getCurrentFrame(), xPos, yPos); break;
		}
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