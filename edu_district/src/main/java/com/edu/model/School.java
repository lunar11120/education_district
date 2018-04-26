package com.edu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = School.FIND_ALL_Primary_school , query =  "SELECT g FROM School g"),
	@NamedQuery(name = School.FIND_ALL_School , query = "SELECT g FROM School g"  )	
})
public class School {
	
	public static final String FIND_ALL_School = "findAllSchools";
	public static final String FIND_ALL_Primary_school = "findAllPrimarySchools";	

	@Id
	@GeneratedValue	
	private long id;
	private long schoolID;
	private String schoolName;
	private String schoolType;
	private String schoolDirector;
	private String schoolUrl;
	private int teacher_and_employee;
	
	//District Type [primary_school = 0] [high_school = 1]
	private Boolean districtType;
	
	@ManyToOne
	@JoinColumn(name="district_id")
	private District district;

		
	public Boolean getDistrictType() {
		return districtType;
	}


	public void setDistrictType(Boolean districtType) {
		this.districtType = districtType;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getSchoolID() {
		return schoolID;
	}


	public void setSchoolID(long schoolID) {
		this.schoolID = schoolID;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getSchoolType() {
		return schoolType;
	}


	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}


	public String getSchoolDirector() {
		return schoolDirector;
	}


	public void setSchoolDirector(String schoolDirector) {
		this.schoolDirector = schoolDirector;
	}


	public String getSchoolUrl() {
		return schoolUrl;
	}


	public void setSchoolUrl(String schoolUrl) {
		this.schoolUrl = schoolUrl;
	}


	public int getTeacher_and_employee() {
		return teacher_and_employee;
	}


	public void setTeacher_and_employee(int teacher_and_employee) {
		this.teacher_and_employee = teacher_and_employee;
	}

	

	public District getDistrict() {
		return district;
	}


	public void setDistrict(District district) {
		this.district = district;
	}


	@Override
	public String toString() {
		return "School [id=" + id + ", schoolID=" + schoolID + ", schoolName=" + schoolName + "]";
	}

	
	
	
}

