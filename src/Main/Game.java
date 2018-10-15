package Main;
import InputHandler.KeyboardInput;
import Worlds.WorldOne;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {
	
	//everything needed to render
	private Pane root;
	private Canvas canvas;
	private GraphicsContext gc;
	private Scene scene;
	
	//key input
	private KeyboardInput input;
	
	//root pane properties
	public static final double SCALE = 2.5;
	public static final double WIDTH = 500*SCALE;
	public static final double HEIGHT = 300*SCALE;
	
	
	//window properties
	private static final String TITLE = "TU CARA";
	
	//worlds
	WorldOne w1;
	
	//launch method for main method
	public static void launchGame() {launch();}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		init();
		stage.setScene(scene);
		stage.setTitle(TITLE);
		stage.show();
		
		//loop
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long now) {
				tick(scene);
				render(gc);
			}
		};timer.start();
	}
	
	public void init() {
		root = new Pane();
		scene = new Scene(root);
		canvas = new Canvas(WIDTH, HEIGHT);
		gc = canvas.getGraphicsContext2D();
		input = new KeyboardInput();
		w1 = new WorldOne(input);
		root.getChildren().add(canvas);
	}
	
	public void tick(Scene scene) {
		input.tick(scene);
		w1.tick();
	}
	
	public void render(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, WIDTH, HEIGHT);
		w1.render(gc);
	}
	
}
