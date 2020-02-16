package com.customer.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDao;
import com.customer.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDaoImpl;
	
	public void saveCustomer(Customer customer) {
		
		customerDaoImpl.saveCustomer(customer);
	}

	public Customer findById(int id) {
		
		return customerDaoImpl.getById(id);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDaoImpl.findAll();
	}

}
