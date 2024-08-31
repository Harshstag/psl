package com.springboot.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	//Fill your code here
	private String title;

	//Fill your code here
	private String genre;

	//Fill your code here
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
