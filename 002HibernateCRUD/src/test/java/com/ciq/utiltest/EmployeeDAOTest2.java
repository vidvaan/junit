package com.ciq.utiltest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dao.EmployeeDAOImpl;
import com.ciq.entity.Employee;

public class EmployeeDAOTest2 {

	private static EmployeeDAO employeeDAO;

	@BeforeClass
	public static void setUp() {
		employeeDAO = new EmployeeDAOImpl();
	}

	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Balaji");
		employee.setEsal(20000.00);
		return employee;
	}

	@Test
	public void addTest() {
		Employee employee = getEmployee();
		// Add Test
		employeeDAO.add(employee);
		Employee employeeObj = employeeDAO.findById(1);
		assertEquals("Balaji", employeeObj.getEname());
	}

	@Test
	public void updateTest() {

		Employee employee = getEmployee();
		// Update
		employee.setEname("Balaji G");
		employeeDAO.update(employee);
		Employee employeeObj = employeeDAO.findById(1);
		assertEquals("Balaji G", employeeObj.getEname());

	}

	@Test
	public void deleteTest() {
		// Delete Test
		employeeDAO.deleteById(1);
		Employee employeeObj = employeeDAO.findById(1);
		assertNull(employeeObj);
	}

}
