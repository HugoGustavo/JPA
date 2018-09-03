package com.tutorialspoint.eclipselink.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Clas;
import com.tutorialspoint.eclipselink.entity.Teacher;

public class ManyToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Clas clas1 = new Clas(0, "1st", null);
		Clas clas2 = new Clas(0, "2nd", null);
		Clas clas3 = new Clas(0, "3rd", null);
		
		entityManager.persist(clas1);
		entityManager.persist(clas2);
		entityManager.persist(clas3);
		
		Set<Clas> classSet1 = new HashSet();
		classSet1.add(clas1);
		classSet1.add(clas2);
		classSet1.add(clas3);
		
		Set<Clas> classSet2 = new HashSet();
		classSet2.add(clas1);
		classSet2.add(clas2);
		classSet2.add(clas3);
		
		Set<Clas> classSet3 = new HashSet();
		classSet3.add(clas1);
		classSet3.add(clas2);
		classSet3.add(clas3);
		
		Teacher teacher1 = new Teacher(0, "Statish", "Java", classSet1);
		Teacher teacher2 = new Teacher(0, "Krishna", "Adv Java", classSet2);
		Teacher teacher3 = new Teacher(0, "Masthanvali", "DB2", classSet3);
		
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(teacher3);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
