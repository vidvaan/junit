package com.ciq.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_NEW_TAB")
@NamedQueries(value = { @NamedQuery(name = "findAll", query = "from Employee"),
		@NamedQuery(name = "findByEname", query = "from Employee e where e.ename = :ename"),
		@NamedQuery(name = "findEidEnameAll", query = "select eid,ename from Employee"),
		@NamedQuery(name = "updateEmpSal", query = "update Employee set esal = :esal"),
		@NamedQuery(name = "deleteByEname", query = "delete from Employee where ename = :ename") })

@NamedNativeQueries(value = { @NamedNativeQuery(name = "findAllSQL", query = "SELECT * FROM EMP_TAB", resultClass = Employee.class)})
public class Employee {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private double esal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
