package states;

import javafx.scene.canvas.GraphicsContext;
import main.Handler;

public class ExitState extends State{

	public ExitState(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		System.out.println("exit");
		System.exit(0);
	}

	@Override
	public void render(GraphicsContext gc) {}
	
	
}
