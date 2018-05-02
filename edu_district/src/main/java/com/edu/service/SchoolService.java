package com.edu.service;

import java.util.List;

import com.edu.model.School;

public interface SchoolService {
	
	School save(School school);
	
	List<School> findAllSchool();
	List<School> find_by_Name(String school_name);
	School findSchoolBy_ID(long id);
	void deleteSchool(long school_id);
}
