package com.yuelchen.game;

public class PlayGame {

	private int turns; 
	private int maxTurns;
	
	public PlayGame() {
		this.turns = 0;
		this.maxTurns = Integer.MAX_VALUE;
	}
	
	public PlayGame(int maxTurns) {
		this.turns = 0;
		this.maxTurns = maxTurns;
	}
	
	public int getTurns() {
		return this.turns;
	}
	
	public int getMaxTurns() {
		 return this.maxTurns;
	}
	
	public void matchInteger(String question, int answer) {
		
		
	}
	
	
}