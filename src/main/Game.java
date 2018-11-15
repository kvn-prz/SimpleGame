package main;

import inputManager.KeyManager;
import inputManager.MouseManager;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import res.Images;
import states.ExitState;
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
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	//handler
	private Handler handler;
	
	//game camera
	private GameCamera gameCamera;
	
	//root pane properties
	public static final float SCALE = 2.4F;
	public static final float WIDTH = 500*SCALE;
	public static final float HEIGHT = 300*SCALE;
	
	//window title
	private static final String TITLE = "Simple Game";
	
	//states
	public static State gameState;
	public static State menuState;
	public static State exitState;
	
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
		stage.getIcons().add(Images.icon);
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
		
		//initialize game utilities
		images = new Images();
		mouseManager = new MouseManager();
		keyManager = new KeyManager();
		handler = new Handler(this);
		gameCamera = new GameCamera(0, 0);
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		exitState = new ExitState(handler);
		State.setState(menuState);
	}
	
	//tick and render
	public void tick() {if(gameState != null) State.getState().tick();}
	public void render() {if(gameState != null) State.getState().render(gc);}
	
	//getters
	public KeyManager getKeyManager() {return this.keyManager;}
	public MouseManager getMouseManager() {return this.mouseManager;}
	public Pane getRoot() {return this.root;}
	public Scene getScene() {return this.scene;}
	public GameCamera getGameCamera() {return this.gameCamera;}
}
