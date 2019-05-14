package com.techm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techm.dao.CustomerImpl;
import com.techm.model.Customer;

@RestController
public class CustomerController {
	@Autowired
	private CustomerImpl customerImpl;
	
	@GetMapping("/getTestData")
	public Customer getTestEmp() {
		return new Customer(1001, "Sai", 23000.00);
	}

	@PostMapping("/add")
	public Customer add(@RequestBody Customer Customer) {
		return customerImpl.save(Customer);

	}
	
	@PutMapping("/update")
	public Customer update(@RequestBody Customer Customer) {
		return customerImpl.save(Customer);

	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		customerImpl.deleteById(id);
		return "Successfully Deleted!";
	}
	
	@GetMapping("/findById/{id}")
	public Customer findById(@PathVariable("id") Integer id) {
		return customerImpl.findById(id).get();
	}
	
	@GetMapping("/findAll")
	public List<Customer> findAll() {
		return customerImpl.findAll();
	}
	
	

}

