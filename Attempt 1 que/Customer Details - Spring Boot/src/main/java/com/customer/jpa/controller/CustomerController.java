package com.customer.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.jpa.domain.CustomerDetails;
import com.customer.jpa.service.CustomerService;

@RestController
@RequestMapping(value = "/customers/details")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping()
    public List<CustomerDetails> fetchAll() {
        return service.findAll();

    }

    @PostMapping(value = "/{id}")
    public CustomerDetails addCustomer(@RequestBody CustomerDetails customer) {
        return service.addCustomer(customer);

    }

    @PutMapping(value = "/{id}")
    public CustomerDetails updateCustomer(@RequestBody CustomerDetails customer) {
        return service.save(customer);

    }

    @GetMapping(value = "/{id}")
    public CustomerDetails findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Boolean deleteCustomer(@PathVariable Long id) {
        return service.deleteById(id);
    }

}
