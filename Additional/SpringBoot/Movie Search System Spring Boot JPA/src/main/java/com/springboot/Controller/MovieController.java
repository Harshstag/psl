package com.springboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Domain.Movie;
import com.springboot.service.MovieService;

@RestController
@RequestMapping(value="/movie")
public class MovieController {

	
	@Autowired
	private MovieService movieService;


	@GetMapping(value="/list")
	public List<Movie> getAllMovies() {

		return movieService.findAll();

	}

	@PostMapping(value="/add")
	public List<Movie> addMovie(@RequestBody Movie movie){

		movieService.save(movie);
		return movieService.findAll();

	}


	@GetMapping(value="/search/{releaseYear}")
	public List<Movie> searchMoviesByReleaseYear(@PathVariable int releaseYear){

		List<Movie> oldList = (List<Movie>) movieService.findAll();
		List<Movie> newList = new ArrayList<>();

		for(Movie m: oldList){
			if(m.getReleaseYear() == releaseYear){
				newList.add(m);
			}
		}
		return newList;
	}
		
}
