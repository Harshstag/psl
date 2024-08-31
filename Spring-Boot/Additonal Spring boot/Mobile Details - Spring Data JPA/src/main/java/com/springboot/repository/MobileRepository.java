package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Mobile;

//Fill your code here
@Repository
public interface MobileRepository extends JpaRepository <Mobile, Long>{

}
