package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Domain.Movie;
import com.springboot.Repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository mRepository;

	public List<Movie> findAll() {
		return mRepository.findAll();
	}

	public Movie save(Movie movie) {
		return mRepository.save(movie);
	}

}
