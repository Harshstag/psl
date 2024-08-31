package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Domain.Movie;
import com.springboot.Repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll() {
        return (List<Movie>) movieRepository.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> findById(Long id) {
     
        return Optional.ofNullable(movieRepository.findOne(id));
    }

    public boolean delete(Long id) {
        Optional<Movie> m = Optional.ofNullable(movieRepository.findOne(id));
    
       if(m.isPresent()){

        movieRepository.delete(id);
        return true;

       }else{
        
        return false;
       
        }
       
    }
}
