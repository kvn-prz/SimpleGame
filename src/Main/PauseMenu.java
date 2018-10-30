package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PauseMenu {
	
	private Image bg;
	private Image resume;
	private Image mainMenu;
	private Image quit;
	
	public PauseMenu() {
		this.bg = new Image("/res/menuBG.png");
		this.resume = new Image("/res/resume.png");
		this.mainMenu = new Image("/res/mainMenu.png");
		this.quit = new Image("/res/quit.png");
	}
	
	public void render(GraphicsContext gc) {
		gc.drawImage(bg, 0, 0);
		gc.drawImage(resume, Game.WIDTH-295, 200);
		gc.drawImage(mainMenu, Game.WIDTH-448, 300);
		gc.drawImage(quit, Game.WIDTH-168, 400);
	}
	
}