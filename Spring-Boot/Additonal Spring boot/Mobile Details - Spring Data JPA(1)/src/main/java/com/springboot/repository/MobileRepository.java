package com.springboot.repository;

import org.springframework.stereotype.Repository;

import com.springboot.entity.Mobile;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long>{

}
