package com.customer.customerdaoimpl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.customer.dao.CustomerDao;
import com.customer.entities.Customer;


@Sql(scripts= {"classpath:/db/insert-users-scripts.sql"})
@ContextConfiguration("classpath:springDemo-data-context.xml")
@RunWith(SpringRunner.class)
public class CustomerDaoImplTest {
	
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	private CustomerDao customerDaoImpl;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saveCustomerToDatabaseTest() {
		
		logger.info("Creating new customer object");
		Customer newCustomer = new Customer("Tobi", "Tosho", "test@mail", "07069595847");
		
		logger.info("Calling customer dao save method");
		customerDaoImpl.saveCustomer(newCustomer);
		
		logger.info("Saved customer id " + newCustomer.getCustomerId());
		
		Customer existingCustomer = customerDaoImpl.getById(newCustomer.getCustomerId());
		
		assertNotNull(existingCustomer);
		
		
	}
	
	@Test
	public void getAllCustomersTest() {
		
		List<Customer> result = customerDaoImpl.findAll();
		assertNotNull(result);
		
		for(Customer c: result) {
			
			logger.info(c.toString());
		}
		
	}
	
	@Test
	public void saveNullCustomerTest() {
		
		Customer tempCustomer = new Customer();
		assertThrows(ConstraintViolationException.class, ()-> customerDaoImpl.saveCustomer(tempCustomer));
		
		
	}

}
