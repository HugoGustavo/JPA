package com.tutorialspoint.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class NameQueries {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("find employee by id");
		
		query.setParameter("id", 1201);
		List<Employee> list = (List<Employee>) query.getResultList();
		
		for ( Employee e: list ) {
			System.out.print("Employee ID: " + e.getEid());
			System.out.println("\t Employee Name: " + e.getEname());
		}
	}

}
