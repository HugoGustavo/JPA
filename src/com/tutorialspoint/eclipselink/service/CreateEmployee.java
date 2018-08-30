package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CreateEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("Gopal");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
