package com.example.dethimodul4.controller;

import com.example.dethimodul4.model.Employee;
import com.example.dethimodul4.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployService employService;
   @GetMapping
    List<Employee> getAll(){
       return employService.getAll();
   }
    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee showEdit(@PathVariable int id) {
        return employService.findById(id);
    }

    @PutMapping("/{id}")
    public Employee edit(@RequestBody Employee employee){
        return employService.save(employee);
    }

    @DeleteMapping("/{id}")
    public Employee delete(@PathVariable int id) {
        return employService.delete(id);
    }


}
