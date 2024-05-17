package com.ciq.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.hibernate.query.SelectionQuery;

import com.ciq.entity.Employee;
import com.ciq.util.SessionUtil;

public class HqlDemo {

	public static void main(String[] args) {

		Session session = SessionUtil.getSession();

		// SQL:: select * from EMP_TAB;

		// HQL:: select e from from Employee e;

//		Query query = session.createQuery("from Employee", Employee.class);
//		List<Employee> employees = query.list();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		//SELECT EID,ENAME  FROM EMP_TAB ;
		
		SelectionQuery<Object[]> query = session.createSelectionQuery("select eid,ename from Employee", Object[].class);
		List<Object[]> employees = query.list();
		for (Object[] colArr : employees) {
			System.out.println(colArr[0]+"  "+colArr[1]);
		}

		
//		Transaction transaction = session.beginTransaction();
//		Query<?> query = session.createQuery("update Employee set esal = :esal");
//		query.setParameter("esal", 400000.00);
//		int result = query.executeUpdate();
//		transaction.commit();
//		System.out.println(result+ " Rows updated");
		
		
//		Transaction transaction = session.beginTransaction();
//		MutationQuery query = session.createMutationQuery("delete from Employee where ename = :ename");
//		query.setParameter("ename", "Balaji G");
//		int result = query.executeUpdate();
//		transaction.commit();
//		System.out.println(result+ " Rows updated");
//
//		SessionUtil.close(session);

	}

}
