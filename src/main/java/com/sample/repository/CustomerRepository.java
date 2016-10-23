package com.sample.repository;

import com.sample.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by susunshun on 2016/10/23.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}
