package com.emp.empCrud.Employe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employe {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    @Column(name="emp_name")
    private String emp_name;

    @Column(name="salary")
    private Float salary;

    @Column(name="age")
    private int age;
    

    public Employe(Long id, String emp_name, Float salary, int age) {
        Id = id;
        this.emp_name = emp_name;
        this.salary = salary;
        this.age = age;
    }



    public Employe() {
    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        
    }



    @Override
    public String toString() {
        return "Employe [Id=" + Id + ", emp_name=" + emp_name + ", salary=" + salary + ", age=" + age + "]";
    }


}
