package Main;

import InputHandler.KeyboardInput;
import Worlds.WorldBase;

public class Handler {
	
	Game game;
	WorldBase world;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	//getters
	public double getWidth() {return game.getWidth();}
	public double getHeight() {return game.getHeight();}
	public Game getGame() {return this.game;}
	public KeyboardInput getKeyInput() {return game.getKeyInput();}
	public WorldBase getWorld() {return this.world;}
	
	//setters
	public void setGame(Game game) {this.game = game;}
	public void setWorld(WorldBase world) {this.world = world;}
	
}
