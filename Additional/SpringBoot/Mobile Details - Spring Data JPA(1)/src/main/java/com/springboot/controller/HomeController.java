package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.MobileService;


@RestController
public class HomeController {
   @Autowired
   private MobileService mobileService;

   public HomeController() {
   }
   @GetMapping("/mobileList")
   public String getAllMovies(Model model) {
      model.addAttribute("mobiles", this.mobileService.findAll());
      return "home.jsp";
   }
}
