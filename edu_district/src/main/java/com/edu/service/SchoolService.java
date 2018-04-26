package com.edu.service;

import java.util.List;

import com.edu.model.School;

public interface SchoolService {
	
	School save(School school);
	
	List<School> findAllSchool();
}
