package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Mobile;
import com.springboot.repository.MobileRepository;

//Fill your code here
@Service
public class MobileService {
	
	//Fill your code here
	

	@Autowired
	MobileRepository mobileRepository;

	public List<Mobile> findAll() {
        //Fill your code here
		return mobileRepository.findAll();
    	}

}
