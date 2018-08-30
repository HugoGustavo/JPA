package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class FindEmployee {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, 1201);
		System.out.println("Employee ID   = " + employee.getEid());
		System.out.println("Employee NAME = " + employee.getEname());
		System.out.println("Employee SALARY = " + employee.getSalary());
		System.out.println("Employee DESIGNATION = " + employee.getDeg());

	}

}
