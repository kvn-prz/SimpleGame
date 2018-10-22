package InputHandler;

import Main.Game;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class MouseInput {
	
	public void click(Scene scene) {
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(Game.state.equals("menu")) {
					if((event.getX()>=700&&event.getX()<=900) && (event.getY()>=200&&event.getY()<=280)) Game.state = "game";
					if((event.getX()>=700&&event.getX()<=868) && (event.getY()>=300&&event.getY()<=380)) Game.state = "exit";
				}
				
				if(Game.state.equals("pause")) {
					if((event.getX()>=700&&event.getX()<=995) && (event.getY()>=200&&event.getY()<=280)) Game.state = "game";
					if((event.getX()>=700&&event.getX()<=1148) && (event.getY()>=300&&event.getY()<=380)) Game.state = "menu";
					if((event.getX()>=700&&event.getX()<=868) && (event.getY()>=400&&event.getY()<=480)) Game.state = "exit";
				}
				
			}});}
	
	public void tick(Scene scene) {
		click(scene);
	}
}
