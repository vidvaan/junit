package com.ciq.demotest;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ciq.dao.AddressDAO;
import com.ciq.dao.DepartmentDAO;
import com.ciq.dao.EmployeeDAO;
import com.ciq.model.Address;
import com.ciq.model.Department;
import com.ciq.model.Employee;
import com.ciq.model.EmployeeResponse;
import com.ciq.service.EmployeeServiceImpl;

public class EmployeeServiceTest {

	@Mock
	private AddressDAO addressDAO;

	@Mock
	private DepartmentDAO departmentDAO;

	@Mock
	private EmployeeDAO employeeDAO;

	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void findByIdEmployeeTest() {
		when(employeeDAO.getEmployeeById(1001)).thenReturn(getEmpSetUp());
		when(addressDAO.getAddressById(1001)).thenReturn(getAddressSetUp());
		when(departmentDAO.getDepartmentById(1001)).thenReturn(getDepartmentSetUp());
		
		
	     EmployeeResponse employeeResponse = 	employeeServiceImpl.getEmployeeById(1001);
	     
	     System.out.println(employeeResponse);

	}

	Employee getEmpSetUp() {
		Employee employee = new Employee();
		employee.setEid(1001);
		employee.setEname("Balaji");
		return employee;
	}

	Address getAddressSetUp() {
		Address address = new Address();
		address.setAid(1);
		address.setAloc("SKLM");
		address.setPincode("532408");
		return address;
	}

	Department getDepartmentSetUp() {
		Department department = new Department();
		department.setDid(1);
		department.setDname("IT");
		return department;
	}

}
