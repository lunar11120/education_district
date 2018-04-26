package com.edu.repository;

import java.util.List;

import com.edu.model.School;

public interface SchoolRepository {
	
	School SR_save_to_database(School school);
	List<School> load_all_schoolList();

}
