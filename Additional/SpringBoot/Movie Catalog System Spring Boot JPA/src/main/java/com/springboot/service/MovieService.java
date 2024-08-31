package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Domain.Movie;
import com.springboot.Repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;

	public List<Movie> findAll() {

		return movieRepository.findAll();

	}

	public Movie save(Movie movie) {
		

		return movieRepository.save(movie);
	}

}

