package com.weather.jpa.repository;

import com.weather.jpa.domain.WeatherReport;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<WeatherReport, Long> {
}
