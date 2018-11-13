package inputManager;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import main.Game;

public class KeyManager {
	
	private boolean isUp = false;
	private boolean isDown = false;
	private boolean isLeft = false;
	private boolean isRight = false;
	private boolean isJump = false;
	private boolean moving = false;
	
	public void pressed(Scene scene) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()) {
				case W: setUp(true); moving = true; break;
				case S: setDown(true); moving = true; break;
				case A: setLeft(true); moving = true; break;
				case D: setRight(true); moving = true; break;
				case SPACE: setJump(true); moving = true; break;
				//TODO pause
				}}});
	}
	
	public void notPressed(Scene scene) {
		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()) {
				case W: setUp(false); moving = false; break;
				case S: setDown(false); moving = false; break;
				case A: setLeft(false); moving = false; break;
				case D: setRight(false); moving = false; break;
				case SPACE: setJump(false); moving = false; break;
				}}});
	}
	
	public void tick(Scene scene) {
		pressed(scene);
		notPressed(scene);
	}
	
	//getters
	public boolean isUp() {return isUp;}
	public boolean isRight() {return isRight;}
	public boolean isLeft() {return isLeft;}
	public boolean isDown() {return isDown;}
	public boolean isJump() {return this.isJump;}
	public boolean isMoving() {return this.moving;}
	
	//setters
	public void setUp(boolean isUp) {this.isUp = isUp;}
	public void setDown(boolean isDown) {this.isDown = isDown;}
	public void setLeft(boolean isLeft) {this.isLeft = isLeft;}
	public void setRight(boolean isRight) {this.isRight = isRight;}
	public void setJump(boolean isJump) {this.isJump = isJump;}
}
