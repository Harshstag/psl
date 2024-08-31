package com.customer.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.jpa.domain.CustomerDetails;

public interface CustomerDetailsRepository extends CrudRepository<CustomerDetails, Long> {
}
