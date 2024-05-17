package com.ciq.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.ciq.entity.Employee;
import com.ciq.util.SessionUtil;


public class NamedQueriesDemo {
	
	public static void main(String[] args) {

		Session session = SessionUtil.getSession();
		
		
//		Query query = session.createNamedQuery("findAll", Employee.class);
//		
//		List<Employee> employees = query.list();
//		
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		
		
//		Query query =  session.createNamedQuery("findByEname",Employee.class);
//		query.setParameter("ename", "Rama G");
//		List<Employee> employees = query.list();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		
		
		
//		Query query =  session.createNamedQuery("findEidEnameAll",Object[].class);
//		List<Object[]> employees = query.list();
//		for (Object[] employee : employees) {
//			System.out.println("Eid " +employee[0]);
//			System.out.println("Ename " +employee[1]);
//		}
		
		
		
		
		Query<Employee> nativeQuery = session.createNamedQuery("findAllSQL", Employee.class);
		
		nativeQuery.list().forEach(System.out::println);
		
		SessionUtil.close(session);
	}

}
