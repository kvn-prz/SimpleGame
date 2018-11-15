package main;

import entities.Player;

public class GameCamera {
	
	private int xOffset;
	private int yOffset;
	
	public GameCamera(int xOffset, int yOffset) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
	public void moveCamera(int xAmmount, int yAmmount) {
		xOffset += xAmmount;
		yOffset += yAmmount;
	}
	
	public void centerCameraOnPlayer(Player player) {
		xOffset = (int) (player.getXpos() - Game.WIDTH / 2);
		yOffset = (int) (player.getYpos() - Game.HEIGHT / 2);
	}
	
	//getters
	public int getXoffset() {return xOffset;}
	public int getYoffset() {return yOffset;}
	
	//setters
	public void setXoffset(int newXoffset) {this.xOffset = newXoffset;}
	public void setYoffset(int newYoffset) {this.yOffset = newYoffset;}
	
}
