package com.springboot.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

	private Long id;
	private String title;
	private String genre;
	private int releaseYear;

}
