package com.ciq.service;

import com.ciq.dao.AddressDAO;
import com.ciq.dao.DepartmentDAO;
import com.ciq.dao.EmployeeDAO;
import com.ciq.model.Address;
import com.ciq.model.Department;
import com.ciq.model.Employee;
import com.ciq.model.EmployeeResponse;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	private AddressDAO addressDAO;

	private DepartmentDAO departmentDAO;

	public EmployeeServiceImpl(EmployeeDAO employeeDAO, AddressDAO addressDAO, DepartmentDAO departmentDAO) {
		super();
		this.employeeDAO = employeeDAO;
		this.addressDAO = addressDAO;
		this.departmentDAO = departmentDAO;
	}

	@Override
	public EmployeeResponse getEmployeeById(Integer eid) {
		Employee employee = employeeDAO.getEmployeeById(eid);
		Address address = addressDAO.getAddressById(eid);
		Department department = departmentDAO.getDepartmentById(eid);
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setAddress(address);
		employeeResponse.setDepartment(department);
		employeeResponse.setEmployee(employee);
		return employeeResponse;
	}

}
