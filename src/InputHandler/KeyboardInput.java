package InputHandler;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class KeyboardInput {
	
	private boolean isUp = false;
	private boolean isDown = false;
	private boolean isLeft = false;
	private boolean isRight = false;	
	
	public void pressed(Scene scene) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()) {
				case W: setUp(true); break;
				case S: setDown(true); break;
				case A: setLeft(true); break;
				case D: setRight(true); break;
				}}});
	}
	
	public void notPressed(Scene scene) {
		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()) {
				case W: setUp(false); break;
				case S: setDown(false); break;
				case A: setLeft(false); break;
				case D: setRight(false); break;
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
	
	//setters
	public void setUp(boolean isUp) {this.isUp = isUp;}
	public void setDown(boolean isDown) {this.isDown = isDown;}
	public void setLeft(boolean isLeft) {this.isLeft = isLeft;}
	public void setRight(boolean isRight) {this.isRight = isRight;}
}
