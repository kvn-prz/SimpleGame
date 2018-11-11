package main;

import inputHandler.KeyboardInput;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import res.Images;
import states.GameState;
import states.MenuState;
import states.State;

public class Game extends Application {
	
	//everything needed to render
	private Pane root;
	private Canvas canvas;
	private GraphicsContext gc;
	private Scene scene;
	
	//input
	private KeyboardInput keyInput;
	
	//handler
	private Handler handler;
	
	//root pane properties
	public static final double SCALE = 2.4;
	public static final double WIDTH = 500*SCALE;
	public static final double HEIGHT = 300*SCALE;
	
	//window title
	private static final String TITLE = "Simple Game";
	
	//TODO states
	private State gameState;
	private State menuState;
	
	//images
	private Images images;
	
	//launch method for main method
	public static void launchGame() {launch();}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void start(Stage stage) throws Exception {
		init();
		stage.setScene(scene);
		stage.setTitle(TITLE);
		stage.setWidth(WIDTH);
		stage.setHeight(HEIGHT);
		stage.setResizable(false);
		stage.show();
		
		//loop
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long now) {
				tick();
				render();
			}
		};timer.start();
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void init() {
		//initialize window
		root = new Pane();
		scene = new Scene(root);
		canvas = new Canvas(WIDTH, HEIGHT);
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		//initialize game utils
		images = new Images();
		keyInput = new KeyboardInput();
		handler = new Handler(this);
		gameState = new GameState();
		menuState = new MenuState();
		State.setState(menuState);
	}
	
	//tick and redner
	public void tick() {if(gameState != null) State.getState().tick();}
	public void render() {if(gameState != null) State.getState().render(gc);}
	
	
	//getters
	public KeyboardInput getKeyInput() {return this.keyInput;}
	public double getWidth() {return WIDTH;}
	public double getHeight() {return HEIGHT;}	
}
