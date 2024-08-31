package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    //Fill your code here
    private String brand;
    
    //Fill your code here
    private String model;
    
    //Fill your code here
    private Double price;
    
    //Fill your code here
    private int releaseYear;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(Long id, String brand, String model, Double price, int releaseYear) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.releaseYear = releaseYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
    	
}
