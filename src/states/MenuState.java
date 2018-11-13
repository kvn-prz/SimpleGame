package states;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import main.Game;
import main.Handler;
import res.Images;

public class MenuState extends State {
	
	private Button startButton;
	private Button quitButton;

	public MenuState(Handler handler) {
		super(handler);
		initButtons();
	}

	@Override
	public void tick() {
		handleStartButton();
		handleQuitButton();
	}

	@Override
	public void render(GraphicsContext gc) {
		gc.drawImage(Images.menuBG, 0, 0);
	}
	
	private void initButtons() {
		startButton = new Button();
		startButton.setLayoutX(Game.WIDTH/2-128);
		startButton.setLayoutY(Game.HEIGHT/2);
		startButton.setPrefSize(256, 128);
		startButton.setStyle("-fx-background-image: url('/res/ui/startButton.png')");
		
		quitButton = new Button();
		quitButton.setLayoutX(Game.WIDTH/2-128);
		quitButton.setLayoutY(Game.HEIGHT/2 + 180);
		quitButton.setPrefSize(256, 128);
		quitButton.setStyle("-fx-background-image: url('/res/ui/quitButton.png')");
		
		handler.getGame().getRoot().getChildren().addAll(startButton, quitButton);
	}
	
	private void handleStartButton() {
		if(startButton.isHover()) startButton.setStyle("-fx-background-image: url('/res/ui/startButtonHover.png')");
		else startButton.setStyle("-fx-background-image: url('/res/ui/startButton.png')");
		startButton.setOnMouseClicked(e ->{
			State.setState(Game.gameState);
			handler.getGame().getRoot().getChildren().removeAll(startButton, quitButton);
		});
	}
	
	private void handleQuitButton() {
		if(quitButton.isHover()) quitButton.setStyle("-fx-background-image: url('/res/ui/quitButtonHover.png')");
		else quitButton.setStyle("-fx-background-image: url('/res/ui/quitButton.png')");
		quitButton.setOnMouseClicked(e ->{
			State.setState(Game.exitState);
		});
	}

}
