package inputManager;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class MouseManager {
	
	private float xPos;
	private float yPos;
	private boolean leftPressed = false;

	public void mouseMove(Scene scene) {
		scene.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				xPos = (float) event.getX();
				yPos = (float) event.getY();
			}});}
	
	public void tick(Scene scene) {
		mouseMove(scene);
	}
	
	//getters
	public float getxPos() {return xPos;}
	public float getyPos() {return yPos;}
	public boolean isLeftPressed() {return leftPressed;}
	
}
