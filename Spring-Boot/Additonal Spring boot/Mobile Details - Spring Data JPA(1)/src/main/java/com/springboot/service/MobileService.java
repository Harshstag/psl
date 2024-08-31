package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.entity.Mobile;
import com.springboot.repository.MobileRepository;

@Service
public class MobileService {
	@Autowired
	private MobileRepository mRepository;

	public List<Mobile> findAll() {
		return mRepository.findAll();
    }

}
