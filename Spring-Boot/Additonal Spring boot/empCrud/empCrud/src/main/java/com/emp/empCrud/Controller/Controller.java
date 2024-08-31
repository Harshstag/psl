package com.emp.empCrud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.empCrud.Repository.EmployeRepository;


@RestController
@RequestMapping(value = "/api")
public class Controller {
    @Autowired
    private EmployeRepository employeRepository;

    @PostMapping("/employe")
    public String createEmploye(@RequestBody Employe employe) {
        employeRepository.save(employe);
        
        return "Suceesful creatd";
    }
    
    

}
