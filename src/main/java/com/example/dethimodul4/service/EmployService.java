package com.example.dethimodul4.service;

import com.example.dethimodul4.model.Employee;
import com.example.dethimodul4.repository.IEmployRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {
    @Autowired
    IEmployRepo iEmployRepo;
    public List<Employee> getAll(){
        return (List<Employee>) iEmployRepo.findAll();
    }
    public Employee save(Employee employee) {return iEmployRepo.save(employee);}
    public Employee findById(int id){
        return iEmployRepo.findById(id).get();
    }
    public Employee delete(int id){
        Employee employee=findById(id);
        iEmployRepo.deleteById(id);
        return employee;
    }
}
