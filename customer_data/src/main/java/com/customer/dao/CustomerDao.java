package com.customer.dao;

import java.util.List;

import com.customer.entities.Customer;

public interface CustomerDao {

	public void saveCustomer(Customer newCustomer);
	
	public Customer getById(int id);
	
	public List<Customer> findAll();
}
