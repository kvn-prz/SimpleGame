package res;

import javafx.scene.image.Image;

public class Images {
	
	//tiles
	public static Image borderTile;
	public static Image stoneTile;
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
	public static Image[] playerFront;
	public static Image[] playerUp;
	public static Image[] playerLeft;
	public static Image[] playerRight;
	
	public Images() {
		
		//tiles
		stoneTile = new Image("/res/tiles/stone.png");
		grassTile = new Image("/res/tiles/grass.png");

		//window
		icon = new Image("/res/ui/icon.png");
		menuBG = new Image("/res/ui/menuBG.png");
		startButton = new Image[2];
		startButton[0] = new Image("/res/ui/startButton.png");
		startButton[1] = new Image("/res/ui/startButtonHover.png");
		
		quitButton = new Image[2];
		quitButton[0] = new Image("/res/ui/quitButton.png");
		quitButton[1] = new Image("/res/ui/quitButtonHover.png");
		
		//player
		playerFront = new Image[4];
		playerFront[0] = new Image("/res/player/playerFront01.png");
		playerFront[1] = new Image("/res/player/playerFront02.png");
		playerFront[2] = new Image("/res/player/playerFront03.png");
		playerFront[3] = new Image("/res/player/playerFront04.png");
		
		playerUp = new Image[4];
		playerUp[0] = new Image("/res/player/playerUp01.png");
		playerUp[1] = new Image("/res/player/playerUp02.png");
		playerUp[2] = new Image("/res/player/playerUp03.png");
		playerUp[3] = new Image("/res/player/playerUp04.png");
		
		playerLeft = new Image[4];
		playerLeft[0] = new Image("/res/player/playerLeft01.png");
		playerLeft[1] = new Image("/res/player/playerLeft02.png");
		playerLeft[2] = new Image("/res/player/playerLeft03.png");
		playerLeft[3] = new Image("/res/player/playerLeft04.png");
		
		playerRight = new Image[4];
		playerRight[0] = new Image("/res/player/playerRight01.png");
		playerRight[1] = new Image("/res/player/playerRight02.png");
		playerRight[2] = new Image("/res/player/playerRight03.png");
		playerRight[3] = new Image("/res/player/playerRight04.png");
		
		
		
		
	}
}
