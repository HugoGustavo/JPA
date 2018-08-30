package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.NonTeachingStaff;
import com.tutorialspoint.eclipselink.entity.Staff;
import com.tutorialspoint.eclipselink.entity.TeachingStaff;

public class SaveClient {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		// Teaching staff entity
		Staff ts1 = new TeachingStaff(1, "Gopal", "MSc MEd", "Maths");
		Staff ts2 = new TeachingStaff(2, "Manisha", "BSc BEd", "English");
	
		Staff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
		Staff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");
	
		entityManager.persist(ts1);
		entityManager.persist(ts2);
		entityManager.persist(nts1);
		entityManager.persist(nts2);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
