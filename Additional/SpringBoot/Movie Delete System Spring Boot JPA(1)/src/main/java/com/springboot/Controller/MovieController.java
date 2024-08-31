package com.springboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
		return (List<Movie>) movieService.findAll();
	}

	@PostMapping(value="/add")
	public List<Movie> addMovie(@RequestBody Movie movie) {
		Movie m = movieService.save(movie);
		return (List<Movie>) movieService.findAll();
	}
	
	@GetMapping(value="/search/{releaseYear")
	public List<Movie> searchMoviesByReleaseYear(@PathVariable int releaseYear){
		List<Movie> oldList=(List<Movie>) movieService.findAll();
		List<Movie> searchMoviesBySameReleaseYear=new ArrayList<>();
		for(Movie m:oldList) {
			if(m.getReleaseYear()==releaseYear) {
				searchMoviesBySameReleaseYear.add(m);
			}
		}
		return searchMoviesBySameReleaseYear;
	}
	
	@DeleteMapping(value="/delete/{id}")
    public Boolean deleteMovie(@PathVariable Long id) {
        try {
        	movieService.delete(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
