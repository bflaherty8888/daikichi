package com.codingdojo.daikichi.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {
	@RequestMapping("")
	public String omikuji() {
		return "omikuji.jsp";
	}
	
	@PostMapping("/process")
	public String process(
			@RequestParam(value="year") Integer year,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="organism") String organism,
			@RequestParam(value="compliment") String compliment,
			HttpSession session
			) {
		
		session.setAttribute("year", year);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("organism", organism);
		session.setAttribute("compliment", compliment);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/show")
	public String show(HttpSession session, Model model) {
		
		model.addAttribute("year", (Integer) session.getAttribute("year"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("organism", session.getAttribute("organism"));
		model.addAttribute("compliment", session.getAttribute("compliment"));
		
		return "fortune.jsp";
	}
}
