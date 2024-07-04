package com.hrs.emp_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;


public class EmpServiceviceImpl implements EmpService {

    EmpRepo empRepo;

    @Override
    public String createEmp(Employee emp) {
        EmpEntity empEntity = new EmpEntity();
        BeanUtils.copyProperties(emp, empEntity);
        // employees.add(emp);
        empRepo.save(empEntity);
        return "Saved Sucessfully ";
    }

    @Override
    public List<Employee> readEmp() {
        List<EmpEntity> empEntityList = empRepo.findAll();
        
        List<Employee> employees = new ArrayList<>();

        for (EmpEntity empEntity : empEntityList) {
            Employee em = new Employee();
            em.setName(empEntity.getName());
            em.setEmail(empEntity.getEmail());
            em.setName(empEntity.getName());
            employees.add(em);
        }

        return employees;
    }

    @Override
    public boolean deleteEmp(Long id) {
        // employees.remove(id);
        return true;
    }

    public EmpRepo getEmpRepo() {
        return empRepo;
    }

    public void setEmpRepo(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

}
