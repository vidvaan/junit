package com.ciq.app;

import java.util.List;

import org.hibernate.Session;

import com.ciq.entity.Employee;
import com.ciq.util.SessionUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaApiDemo {

	public static void main(String[] args) {

		Session session = SessionUtil.getSession();


		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

		Root<Employee> root = criteriaQuery.from(Employee.class);
		
		

		criteriaQuery.where(criteriaBuilder.or(criteriaBuilder.like(root.get("ename"), "K%"),
				criteriaBuilder.equal(root.get("esal"), "400000.00")));
		
		criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.like(root.get("ename"), "K%"),
				criteriaBuilder.equal(root.get("esal"), "400000.00")));

		List<Employee> employees = session.createQuery(criteriaQuery).getResultList();

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		SessionUtil.close(session);

	}

}
