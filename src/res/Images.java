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
	public static Image[] mainMenuButton;
	public static Image[] quitButton;
	public static Image[] resumeButton;
	public static Image[] startButton;
	
	//player
	public static Image player;
	
	public Images() {
		
		//tiles
		borderTile = new Image("/res/tiles/border.png");
		dirtTile = new Image("/res/tiles/dirt.png");
		grassTile = new Image("/res/tiles/grass.png");

//		//window
		icon = new Image("/res/ui/icon.png");
		menuBG = new Image("/res/ui/menuBG.png");
		startButton = new Image[2];
		startButton[0] = new Image("/res/ui/startButton.png");
		startButton[1] = new Image("/res/ui/startButtonHover.png");
		
		quitButton = new Image[2];
		quitButton[0] = new Image("/res/ui/quitButton.png");
		quitButton[1] = new Image("/res/ui/quitButtonHover.png");
		
		//player
		player = new Image("/res/player/playerFront.png");
//		player = new Image[4];
//		player[0] = new Image("/res/player/playerFront.png");
//		player[1] = new Image("/res/player/playerBack.png");
//		player[2] = new Image("/res/player/playerRight.png");
//		player[3] = new Image("/res/player/playerLeft.png");
		
	}
}
