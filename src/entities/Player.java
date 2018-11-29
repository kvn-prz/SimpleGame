package entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import main.Game;
import main.Handler;
import res.Animation;
import res.Images;

public class Player extends Button {
	
	private int speed;
	private int direction = 0;
	
	private Animation animUp;
	private Animation animDown;
	private Animation animLeft;
	private Animation animRight;
	private int animationSpeed;
	
	private Handler handler;
	
	public Player(Handler handler) {
		this.handler = handler;
		setPrefSize(64, 68);
		setOnMouseClicked(e ->{
			System.out.println("CLICKED");
		});
		setStyle("-fx-background-color: transparent");
		speed = 4;
		animationSpeed = 100;
		animUp = new Animation(animationSpeed, Images.playerUp);
		animDown = new Animation(animationSpeed, Images.playerFront);
		animLeft= new Animation(animationSpeed, Images.playerLeft);
		animRight = new Animation(animationSpeed, Images.playerRight);
	}
	
	public void tick() {
		animUp.tick();
		animDown.tick();
		animLeft.tick();
		animRight.tick();
		move();
	}
	
	public void render(GraphicsContext gc) {
		
	}
	
	public void move() {
	
	}
}
