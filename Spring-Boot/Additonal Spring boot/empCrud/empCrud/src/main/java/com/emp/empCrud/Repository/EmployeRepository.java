package com.emp.empCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.empCrud.Employe.Employe;

@Repository
public interface EmployeRepository extends  JpaRepository<Employe, Long> {

}
