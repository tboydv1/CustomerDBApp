package com.customer.customerservice;

import java.util.List;

import com.customer.entities.Customer;

public interface CustomerService {

	
	public void saveCustomer(Customer customer);
	
	public Customer findById(int id);
	
	public List<Customer> findAll();
	
	
}
