package com.weather.jpa.controller;

import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weatherReport")
public class WeatherController {

	private final WeatherService weatherService;

	@Autowired
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

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
