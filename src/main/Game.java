package main;

import inputHandler.KeyboardInput;
import inputHandler.MouseInput;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import worlds.WorldOne;

public class Game extends Application {
	
	//everything needed to render
	private Pane root;
	private Canvas canvas;
	private GraphicsContext gc;
	private Scene scene;
	
	//input
	private KeyboardInput keyInput;
	private MouseInput mouseInput;
	//handler
	private Handler handler;
	
	//root pane properties
	public static final double SCALE = 2.4;
	public static final double WIDTH = 500*SCALE;
	public static final double HEIGHT = 300*SCALE;
	
	//window title
	private static final String TITLE = "Simple Game";
	
	//worlds
	WorldOne w1;
	
	//states
	public static String state;
	private MainMenu menu;
	private PauseMenu pause;
	
	//launch method for main method
	public static void launchGame() {launch();}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void start(Stage stage) throws Exception {
		
		init();
		stage.initStyle(StageStyle.UNDECORATED);
		stage.setScene(scene);
		stage.setTitle(TITLE);
		stage.setWidth(WIDTH);
		stage.setHeight(HEIGHT);
		stage.setResizable(false);
		stage.getIcons().add(new Image("/res/icon.png"));
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
		root = new Pane();
		scene = new Scene(root);
		canvas = new Canvas(WIDTH, HEIGHT);
		gc = canvas.getGraphicsContext2D();
		keyInput = new KeyboardInput();
		mouseInput = new MouseInput();
		handler = new Handler(this);
		root.getChildren().add(canvas);
		
		w1 = new WorldOne(handler);
		menu = new MainMenu();
		pause = new PauseMenu();
		state = "menu";
	}
	
	public void tick() {
		switch(state) {
			case "game": keyInput.tick(scene); w1.tick(); break;
			case "menu": mouseInput.tick(scene) ;break;
			case "pause": mouseInput.tick(scene); break;
			case "exit": System.exit(0); break;
		}
		
	}
	
	public void render() {
		switch(state) {
			case "game": w1.render(gc); break;
			case "menu": menu.render(gc); break;
			case "pause": pause.render(gc);
		}
	}
	
	//getters
	public KeyboardInput getKeyInput() {return this.keyInput;}
	public double getWidth() {return WIDTH;}
	public double getHeight() {return HEIGHT;}	
}
