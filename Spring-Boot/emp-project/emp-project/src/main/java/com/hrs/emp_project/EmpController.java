package com.hrs.emp_project;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {
    // List<Employee> employees = new ArrayList<>();
    // EmpService empService  = new EmpServiceviceImpl();

    EmpService empService;

    
    @GetMapping("/employees")
    public List<Employee> getAllEmp() {
        return empService.readEmp();
    }

    @PostMapping("/employees")
    public String addEmp(@RequestBody Employee emp) {
        return empService.createEmp(emp);

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmp(@PathVariable Long id) {
        if (empService.deleteEmp(id)) {
            return "Deleted Successfully";
        } else {
            return "Not Deleted Successfully";
        }
    }  

    public EmpService getEmpService() {
        return empService;
    }

    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }
}
