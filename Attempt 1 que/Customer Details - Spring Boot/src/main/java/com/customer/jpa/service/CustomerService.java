package com.customer.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.jpa.domain.CustomerDetails;
import com.customer.jpa.repository.CustomerDetailsRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerDetailsRepository repo;

    public List<CustomerDetails> findAll() {
        return (List<CustomerDetails>) repo.findAll();
    }

    public CustomerDetails addCustomer(CustomerDetails customer) {
        return repo.save(customer);
    }

    public CustomerDetails save(CustomerDetails customer) {

        Long id = customer.getId();
        CustomerDetails exist = repo.findById(id).orElse(null);
        // if (exist == null) {
        // throw new EntityNotFoundException("Customer not found with id: " + id);
        // }

        exist.setFirstName(customer.getFirstName());
        exist.setLastName(customer.getLastName());
        exist.setMobileNumber(customer.getMobileNumber());

        return repo.save(exist);
    }

    public CustomerDetails findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Boolean deleteById(Long id) {
        CustomerDetails cust = repo.findById(id).orElse(null);
        if (cust != null) {
            repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}