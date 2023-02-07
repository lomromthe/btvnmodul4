package com.example.dethimodul4.repository;

import com.example.dethimodul4.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBraRepo extends PagingAndSortingRepository<Branch,Long> {

}