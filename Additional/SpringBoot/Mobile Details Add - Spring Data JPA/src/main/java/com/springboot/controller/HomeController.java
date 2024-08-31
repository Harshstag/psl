package com.springboot.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.entity.Mobile;
import com.springboot.service.MobileService;

//Fill your code here
@Controller
public class HomeController {
	
	//Fill your code here
	@Autowired
	MobileService mobileService;

	//Fill your code here
	public String addHotel(Model model) {		
		//Fill your code here
		return mobileService.ad
	}  4

	//Fill your code here
	public String getAllMovies(Model model) {
		//Fill your code here
		return model.getAllMovies(); 
	}
	
	//Fill your code here  
	public String saveHotelDetails(@RequestParam("brand") String brand,
			@RequestParam("model") String model,@RequestParam("price") Double price,
			@RequestParam("releaseYear") int releaseYear) throws ParseException{ 
		
		//Fill your code here 		
	}
	
}
