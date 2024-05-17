package com.ciq.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.ciq.entity.Employee;
import com.ciq.util.SessionUtil;

public class NativeSqlDemo {

	public static void main(String[] args) {

		Session session = SessionUtil.getSession();

		NativeQuery query = session.createNativeQuery("SELECT * FROM EMP_TAB", Employee.class);
		List<Employee> employees = query.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		SessionUtil.close(session);
	}

}
