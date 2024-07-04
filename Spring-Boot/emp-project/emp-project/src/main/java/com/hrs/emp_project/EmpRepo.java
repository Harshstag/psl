package com.hrs.emp_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpRepo  extends JpaRepository<EmpEntity, Long>{
    
}
