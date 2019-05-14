package com.techm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techm.model.Customer;

public interface CustomerImpl extends JpaRepository<Customer, Integer>{

}
