package com.spring.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.ui.Model;

import com.spring.dao.ProductDAO;
import com.spring.dao.ProductDAOImpl;
import com.spring.entity.Product;
import com.spring.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

  @Autowired
  ProductService productService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView index(ModelMap model) {
    ArrayList<Product> productList = productService.returnList();
    model.addAttribute("productList", productList);
    return new ModelAndView("home", "command", new Product());
  }

}