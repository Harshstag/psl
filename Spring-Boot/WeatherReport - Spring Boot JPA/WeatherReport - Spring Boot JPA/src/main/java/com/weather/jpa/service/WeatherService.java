package com.weather.jpa.service;

import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

	private final WeatherRepository weatherRepository;

	@Autowired
	public WeatherService(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	public List<WeatherReport> getData() {
		return (List<WeatherReport>) weatherRepository.findAll();
	}

	public WeatherReport addCases(WeatherReport cases) {
		return weatherRepository.save(cases);
	}

	public WeatherReport updateCases(WeatherReport cases) {
		return weatherRepository.save(cases);
	}

	public WeatherReport view(Long id) {
		return weatherRepository.findById(id).orElse(null);
	}

	public Boolean deleteCases(Long id) {
		try {
			weatherRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
