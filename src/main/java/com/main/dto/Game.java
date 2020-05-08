package com.main.dto;

public class Game {
	@Entity
	@Table(name = "Games")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
