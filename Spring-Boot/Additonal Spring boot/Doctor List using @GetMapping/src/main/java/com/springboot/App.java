package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.controller.DoctorController;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

	SpringApplication.run(App.class, args);

	}

}