package com.edu.service;

import java.util.List;

import com.edu.model.District;

public interface DistrictService {
	
	District save(District district);
	
	List<District> findAllDistrict();

}
