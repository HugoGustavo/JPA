package com.tutorialspoint.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class BetweenAndLikeFunctions {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Between
		Query query = entityManager.createQuery("Select e " + "from Employee e " + "where e.salary " + "Between 30000 and 40000" );
		
		List<Employee> list = (List<Employee>) query.getResultList();
		
		for ( Employee e : list ) {
			System.out.print("Employee ID : " + e.getEid());
			System.out.println("\t Employee salary: " + e.getSalary());
		}
		
		// Like
		Query query1 = entityManager.createQuery("Select e " + "from Employee e " + "where e.ename LIKE 'G%'");
		List<Employee> list1 = (List<Employee>) query1.getResultList();
		
		for ( Employee e : list1 ) {
			System.out.print("Employee ID: " + e.getEid());
			System.out.println("\t Employee name: " + e.getEname());			
		}		
	}
}
