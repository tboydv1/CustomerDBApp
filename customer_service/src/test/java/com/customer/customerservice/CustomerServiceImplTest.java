package com.customer.customerservice;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;

import com.customer.entities.Customer;

@ContextConfiguration(value= {"ServiceContextConfig.class"})
public class CustomerServiceImplTest {

	Customer customer;
	
	@Mock
	CustomerService customerServiceImpl;
	

	
	@Before
	public void setUp() throws Exception {
		
		customerServiceImpl = mock(CustomerService.class);
		
		customer = new Customer();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saveCustomerMethodTest() {

		Customer customer = new Customer();
		
		doNothing().when(customerServiceImpl).saveCustomer(customer);
		customerServiceImpl.saveCustomer(customer);
		
		verify(customerServiceImpl, times(1)).saveCustomer(customer);

		
	}
	
	@Test
	public void findCustomerByIdTest() {
		
		when(customerServiceImpl.findById(1)).thenReturn(isA(Customer.class));
		customerServiceImpl.findById(1);
		
		verify(customerServiceImpl, times(1)).findById(1);
	}
	
	@Test
	public void findAllCustomersTest() {
		
		List<Customer> customers = new ArrayList<>();
		when(customerServiceImpl.findAll()).thenReturn(customers);
		customerServiceImpl.findById(1);
		
		verify(customerServiceImpl, times(1)).findById(1);
		
	}

}
