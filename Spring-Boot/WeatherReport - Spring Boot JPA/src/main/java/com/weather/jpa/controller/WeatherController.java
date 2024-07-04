package com.weather.jpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.service.WeatherService;


@RestController
@RequestMapping("/weatherReport")
public class WeatherController {
	
    @Autowired
	private WeatherService weatherService;

	@GetMapping
	public List<WeatherReport> getData() {
		return weatherService.getData();
	}
	
	@PostMapping
	public WeatherReport addCases(@RequestBody WeatherReport cases) {
		return weatherService.addCases(cases);
	}

	@PutMapping
	public WeatherReport updateCases(@RequestBody WeatherReport cases) {
		return weatherService.updateCases(cases);
	}
	
	@GetMapping("/{id}")
	public WeatherReport view(@PathVariable Long id) {
		return weatherService.view(id);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteCases(@PathVariable Long id) {
        return weatherService.deleteCases(id);
	}
	
}
