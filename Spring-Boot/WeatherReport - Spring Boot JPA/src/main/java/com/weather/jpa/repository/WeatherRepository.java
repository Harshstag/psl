package com.weather.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weather.jpa.domain.WeatherReport;
@Repository
public interface WeatherRepository extends CrudRepository<WeatherReport, Long> {
    
}
