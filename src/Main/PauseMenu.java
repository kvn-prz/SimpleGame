package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PauseMenu {
	
	private Image bg;
	private Image resume;
	private Image mainMenu;
	private Image quit;
	
	public PauseMenu() {
		this.bg = new Image("/Resources/menuBG.png");
		this.resume = new Image("/Resources/resume.png");
		this.mainMenu = new Image("/Resources/mainMenu.png");
		this.quit = new Image("/Resources/quit.png");
	}
	
	public void render(GraphicsContext gc) {
		gc.drawImage(bg, 0, 0);
		gc.drawImage(resume, 700, 200);
		gc.drawImage(mainMenu, 700, 300);
		gc.drawImage(quit, 700, 400);
	}
	
}