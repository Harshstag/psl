package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.service.MobileService;


@Controller
public class HomeController {
	
	//Fill your code here
	@Autowired
	MobileService mobileService;



	@GetMapping("/mobileList")
	public String getAllMovies(Model model) {
		model.addAttribute("mobiles", mobileService.findAll());
		return "home";
	}

}
