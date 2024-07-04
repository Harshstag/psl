package com.spring.service;

import com.spring.dao.OwnerDAO;
import com.spring.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
	private final OwnerDAO ownerDAO;

	@Autowired
	public OwnerService(OwnerDAO ownerDAO) {
		this.ownerDAO = ownerDAO;
	}

	public List<Owner> getAllOwners() {
		return ownerDAO.getAllOwners();
	}

	public String getOwnerNumberByName(String name) {
		return ownerDAO.getOwnerNumberByName(name);
	}
}