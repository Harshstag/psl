package com.hrs.emp_project;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    String createEmp(Employee emp);
    List<Employee> readEmp();
    boolean deleteEmp(Long id);
    
}
