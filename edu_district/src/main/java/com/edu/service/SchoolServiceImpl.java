package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.model.School;
import com.edu.repository.SchoolRepository;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private SchoolRepository schoolRepository;


	public School save(School school) {
		System.out.println("{Service} saveSchool running | get data:"+school);
		
		return schoolRepository.SR_save_to_database(school);
	}

	public List<School> findAllSchool() {		
		return schoolRepository.load_all_schoolList();
	}

	public School findSchoolBy_ID(long id) {
		return schoolRepository.getBySchoolId(id);
	}

	public void deleteSchool(long school_id) {
		schoolRepository.deleteSchool(school_id);
		
	}

	public List<School> find_by_Name(String school_name) {
		return schoolRepository.find_by_Name(school_name);
	}

}
