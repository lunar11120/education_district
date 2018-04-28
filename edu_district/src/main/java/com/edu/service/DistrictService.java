package com.edu.service;

import java.util.List;

import com.edu.model.District;

public interface DistrictService {
	
	District save(District district);
	
	List<District> findAllDistrict();
	
	List<District> findAll_dsitrictHighschool();
	
	List<District> findAll_dsitrictPrimaryschool();
	
	District find_by_id(int id); 

}
