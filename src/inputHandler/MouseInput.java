package inputHandler;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import main.Game;

public class MouseInput {
	
	public void click(Scene scene) {
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(Game.state.equals("menu")) {
					if((event.getX()>=Game.WIDTH-200&&event.getX()<=Game.WIDTH) && (event.getY()>=200&&event.getY()<=280)) Game.state = "game";
					if((event.getX()>=Game.WIDTH-168&&event.getX()<=Game.WIDTH) && (event.getY()>=300&&event.getY()<=380)) Game.state = "exit";
				}
				
				if(Game.state.equals("pause")) {
					if((event.getX()>=Game.WIDTH-295&&event.getX()<=Game.WIDTH) && (event.getY()>=200&&event.getY()<=280)) Game.state = "game";
					if((event.getX()>=Game.WIDTH-448&&event.getX()<=Game.WIDTH) && (event.getY()>=300&&event.getY()<=380)) Game.state = "menu";
					if((event.getX()>=Game.WIDTH-168&&event.getX()<=Game.WIDTH) && (event.getY()>=400&&event.getY()<=480)) Game.state = "exit";
				}
				
			}});}
	
	public void tick(Scene scene) {
		click(scene);
	}
}
