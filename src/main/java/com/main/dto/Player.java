package com.main.dto;

public class Player {
	@Entity
	@Table(name = "Players")
	String playerNamae;
	String gameContent;
	String date;
	int result;
	public String getPlayerNamae() {
		return playerNamae;
	}
	public void setPlayerNamae(String playerNamae) {
		this.playerNamae = playerNamae;
	}
	public String getGameContent() {
		return gameContent;
	}
	public void setGameContent(String gameContent) {
		this.gameContent = gameContent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

}
