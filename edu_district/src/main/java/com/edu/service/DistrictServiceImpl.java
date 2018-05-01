package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.model.District;
import com.edu.repository.DistrictRepository;

@Service("education_District_Service")
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictRepository districtRepository;
	
	public District save(District district) {
		System.out.println("{Service} saveDistrict running | get data:"+district);
		
		return districtRepository.DT_save_to_database(district);	
	}

	public List<District> findAllDistrict() {
		
		return districtRepository.load_all_district();
	}

	public District find_by_id(int id) {
		return districtRepository.getByDistrictId(id);
	}

	public List<District> findAll_dsitrictHighschool() {
		return districtRepository.load_all_dsitrictHighschool();
	}

	public List<District> findAll_dsitrictPrimaryschool() {
		return districtRepository.load_all_dsitrictPrimaryschool();
	}

	public void deleteDistrict(int id) {
		districtRepository.deleteDistrict(id);
		return ;
	}

}
