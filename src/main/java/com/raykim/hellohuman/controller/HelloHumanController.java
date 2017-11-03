package com.raykim.hellohuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, Model model) {
		if(name == null) {
			name = "Human";
		}
		System.out.println(name);
		model.addAttribute("name", name);
		return "index";
	}
}
