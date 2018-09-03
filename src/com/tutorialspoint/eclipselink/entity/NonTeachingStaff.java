package com.tutorialspoint.eclipselink.entity;

import javax.persistence.Entity;

@Entity
public class NonTeachingStaff extends Staff {
	private static final long serialVersionUID = 1L;
	private String areaExpertise;
	
	public NonTeachingStaff(int sid, String sname, String areaExpertise) {
		super(sid, sname);
		this.areaExpertise = areaExpertise;
	}
	
	public NonTeachingStaff() {
		super();
	}

	public String getAreaExpertise() {
		return areaExpertise;
	}

	public void setAreaExpertise(String areaExpertise) {
		this.areaExpertise = areaExpertise;
	}
}
