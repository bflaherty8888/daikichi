package com.codingdojo.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location") String location) {
		return String.format("Congratulations! You will soon travel to %s!", location);
	}
	
	@RequestMapping("/lotto/{num}")
	public String travel(@PathVariable("num") int num) {
		return num % 2 == 0 ? "You will take a grand journey in the near future, but be <b>WARY</b> of tempting offers." : "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
	}
}
