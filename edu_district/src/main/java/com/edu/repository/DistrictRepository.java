package com.edu.repository;

import java.util.List;

import com.edu.model.District;

public interface DistrictRepository {
	
	District DT_save_to_database(District district);
	List<District> load_all_district();
	List<District> load_all_dsitrictHighschool();
	List<District> load_all_dsitrictPrimaryschool();
	District getByDistrictId(int id); 
	void deleteDistrict(int id);

}
