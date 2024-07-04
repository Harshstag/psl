package com.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private String name;
	private String brand;
	private String category;
	private Double price;

	public Product() {

	}

	public Product(String name, String brand, String category, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
