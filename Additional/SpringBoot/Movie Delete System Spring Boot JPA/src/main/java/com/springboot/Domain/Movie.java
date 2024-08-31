package com.springboot.Domain;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.hibernate.annotations.Columns;
import org.springframework.boot.autoconfigure.web.ResourceProperties;



@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	private String title;


	private String genre;

	
	private int releaseYear;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Long id, String title, String genre, int releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

}
