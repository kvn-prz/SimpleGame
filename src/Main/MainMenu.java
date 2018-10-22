package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MainMenu {
	
	private Image bg;
	private Image start;
	private Image quit;
	
	public MainMenu() {
		this.bg = new Image("/Resources/menuBG.png");
		this.start = new Image("/Resources/start.png");
		this.quit = new Image("/Resources/quit.png");
	}
	
	public void render(GraphicsContext gc) {
		gc.drawImage(bg, 0, 0);
		gc.drawImage(start, 700, 200);
		gc.drawImage(quit, 700, 300);
	}
	
}
