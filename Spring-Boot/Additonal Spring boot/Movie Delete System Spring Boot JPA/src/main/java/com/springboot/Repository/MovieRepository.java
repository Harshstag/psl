package com.springboot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	Optional<Movie> findById(Long id);
	

}