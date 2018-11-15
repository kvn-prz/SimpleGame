package main;

public class Handler {
	
	Game game;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	//getters
	public double getWidth() {return Game.WIDTH;}
	public double getHeight() {return Game.HEIGHT;}
	public Game getGame() {return this.game;}	
}
