package main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MainMenu {
	
	private Image bg;
	private Image start;
	private Image quit;
	
	public MainMenu() {
		this.bg = new Image("/res/menuBG.png");
		this.start = new Image("/res/start.png");
		this.quit = new Image("/res/quit.png");
	}
	
	public void render(GraphicsContext gc) {
		gc.drawImage(bg, 0, 0);
		gc.drawImage(start, Game.WIDTH-200, 200);
		gc.drawImage(quit, Game.WIDTH-168, 300);
	}
	
}
