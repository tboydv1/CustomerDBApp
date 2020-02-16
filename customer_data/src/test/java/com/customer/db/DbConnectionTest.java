/**
 * 
 */
package com.customer.db;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;



/**
 * @author user
 *
 */

@ContextConfiguration("classpath:springDemo-data-context.xml")
@RunWith(SpringRunner.class)
public class DbConnectionTest {

	
	@Autowired
	private ComboPooledDataSource datasource;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void connectToDatabase() throws SQLException {
		
		String user = "springapp_user";
		String password = "mypassword";
		String jdbcUrl = "jdbc:mysql://localhost:3306/customer_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	
		Connection mycon =null;
		
		try {
						
			mycon = DriverManager.getConnection(jdbcUrl, user, password);
			assertNotNull(mycon);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			mycon.close();
		}
			
	}
	
	@Test
	public void assertDataSourceInitializedTest() {
		
		assertNotNull(datasource);
	}
}
