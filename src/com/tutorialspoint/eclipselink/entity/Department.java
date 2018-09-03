package com.tutorialspoint.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	private String name;
	/*
	@OneToMany( targetEntity = Employee.class )
	private List employeeList;
	
	public List getEmployeeList() {
		return employeeList;
	}
	
	public void setEmployeeList(List employeeList) {
		this.employeeList = employeeList;
	}
	
	*/
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
