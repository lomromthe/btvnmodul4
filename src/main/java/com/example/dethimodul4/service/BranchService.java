package com.example.dethimodul4.service;

import com.example.dethimodul4.repository.IBraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BranchService {
    @Autowired
    IBraRepo iBraRepo;
}
