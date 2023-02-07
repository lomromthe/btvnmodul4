package com.example.dethimodul4.repository;

import com.example.dethimodul4.model.Branch;
import com.example.dethimodul4.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface  IEmployRepo  extends PagingAndSortingRepository<Employee,Integer> {

}