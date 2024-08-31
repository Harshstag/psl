package com.weather.jpa.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;

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
      return (WeatherReport) this.weatherRepository.findById(id).orElse(null);
   }

   public Boolean deleteCases(Long id) {
      try {
         this.weatherRepository.deleteById(id);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

}