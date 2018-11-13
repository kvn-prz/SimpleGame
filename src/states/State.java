package states;

import javafx.scene.canvas.GraphicsContext;
import main.Handler;

public abstract class State {
	
	//controlling states
	private static State currentState = null;
	
	public static void setState(State newState) {currentState = newState;}
	public static State getState() {return currentState;}
	
	//class
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick();
	public abstract void render(GraphicsContext gc);
	
}
