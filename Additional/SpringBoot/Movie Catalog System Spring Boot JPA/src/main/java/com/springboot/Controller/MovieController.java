package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Domain.Movie;
import com.springboot.service.MovieService;


@RestController
@RequestMapping("/movie")
public class MovieController {


	@Autowired
	MovieService movieService;

	@GetMapping("/list")
	public List<Movie> getAllMovies() {

		return movieService.findAll();
	}

	@PostMapping("/add")
	public List<Movie> addMovie(@RequestBody Movie movie) {
		//Fill your code here
		movieService.save(movie);
		return movieService.findAll();
	}

}
