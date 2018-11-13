package main;

import inputManager.KeyManager;

public class Handler {
	
	Game game;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	//getters
	public double getWidth() {return game.getWidth();}
	public double getHeight() {return game.getHeight();}
	public Game getGame() {return this.game;}	
}
