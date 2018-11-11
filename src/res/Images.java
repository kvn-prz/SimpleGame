package res;

import javafx.scene.image.Image;

public class Images {
	
	//tiles
	public static Image borderTile;
	public static Image dirtTile;
	public static Image grassTile;
	
	//window
	public static Image icon;
	public static Image menuBG;
	//buttons
	public static Image mainMenuButton;
	public static Image quitButton;
	public static Image resumeButton;
	public static Image startButton;
	
	//player
	public static Image[] player;
	
	public Images() {
		
		//tiles
		borderTile = new Image("/res/tiles/border.png");
		dirtTile = new Image("/res/tiles/dirt.png");
		grassTile = new Image("/res/tiles/grass.png");
		
		//window
		icon = new Image("/res/ui/icon.png");
		menuBG = new Image("/res/ui/menuBG.png");
		mainMenuButton = new Image("/res/ui/mainMenuButton.png");
		quitButton = new Image("/res/ui/quitButton.png");
		resumeButton = new Image("/res/ui/resumeButton.png");
		startButton = new Image("/res/ui/startButton.png");
		
		//player
		player = new Image[4];
		player[0] = new Image("/res/player/playerFront.png");
		player[1] = new Image("/res/player/playerBack.png");
		player[2] = new Image("/res/player/playerRight.png");
		player[3] = new Image("/res/player/playerLeft.png");
		
	}
}
