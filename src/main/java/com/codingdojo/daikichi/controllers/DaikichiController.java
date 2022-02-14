package com.codingdojo.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors, or you will not.";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity may arise, so be sure to open to new ideas!";
	}
}
