package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	//Fill your code here

}
