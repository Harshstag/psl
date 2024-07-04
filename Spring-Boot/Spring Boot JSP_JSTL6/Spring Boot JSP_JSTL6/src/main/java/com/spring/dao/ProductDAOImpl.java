package com.spring.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	public ArrayList<Product> returnList() {
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product("Chair", "Zeus", "Furniture", 1500.0));
		productList.add(new Product("Garden Path", "Acl", "Outdoor", 1800.0));
		productList.add(new Product("Sofa", "Alias", "Office", 5000.0));
		productList.add(new Product("Table", "Kristalia", "Office", 8600.0));
		productList.add(new Product("Wall Covering", "Elitis", "Decor", 4700.0));
		return productList;

	}

}