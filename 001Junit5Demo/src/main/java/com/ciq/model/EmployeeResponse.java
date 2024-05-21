package com.ciq.model;

import lombok.Data;

@Data
public class EmployeeResponse {
	
	private Employee employee;
	private Department department;
	private Address address;

}
