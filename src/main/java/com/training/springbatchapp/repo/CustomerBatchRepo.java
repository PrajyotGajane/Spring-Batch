package com.training.springbatchapp.repo;

import com.training.springbatchapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerBatchRepo extends JpaRepository<Customer, Integer> {
}
