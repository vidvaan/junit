package com.ciq.utiltest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dao.EmployeeDAOImpl;
import com.ciq.entity.Employee;

public class EmployeeDAOTest {

	private static EmployeeDAO employeeDAO;

	@BeforeClass
	public static void setUp() {
		employeeDAO = new EmployeeDAOImpl();
	}

	@Test
	public void testCrud() {
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Balaji");
		employee.setEsal(20000.00);

		// Add Test
		employeeDAO.add(employee);

		Employee employeeObj = employeeDAO.findById(1);
		assertEquals("Balaji", employeeObj.getEname());

		// Update
		employee.setEname("Balaji G");
		employeeDAO.update(employee);
		employeeObj = employeeDAO.findById(1);
		assertEquals("Balaji G", employeeObj.getEname());

		// Delete Test
		employeeDAO.deleteById(1);
		employeeObj = employeeDAO.findById(1);
		assertNull(employeeObj);
	}
	
	
	

}
