package com.controller;

import org.springframework.*;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/players")
public class Controller {
	
	public static final String PLAYER_BASE_URI = "svc/v1/games";
	
	@ReguestMapping("/all")
	public Player getPlayer(@PathVariable final int ) {
		Player player =  new Player();
		return player
	}

}
