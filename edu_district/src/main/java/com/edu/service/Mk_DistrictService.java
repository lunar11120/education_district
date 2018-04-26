package com.edu.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.edu.model.District;

public class Mk_DistrictService {
	
	private List<District> districts = new LinkedList<District>();
	
	public void createDistrictList(){		
		District dt1=this.createDistrict("สพม.1 กทม", "เขตการศึกษาที่ 1 สพฐ กรุงเทพหมานคร", "44/8 ลาดพร้าว ", "http://www.sc1.com",Boolean.TRUE);
		District dt2=this.createDistrict("สพม.2 นนทบุรี", "เขตการศึกษาที่ 2 สพฐ นนทบุรี", "53/2 ถ.บางกรวย-ไทรน้อย ", "http://www.sc12.go.th",Boolean.TRUE);
		District dt3=this.createDistrict("สพม.3 สมุทรปราการ", "เขตการศึกษาที่ 3 สพฐ สมุทรปราการ", "23.5 หมู่7 ถ.บางห้วยทอง ", "http://www.sc14.go.th",Boolean.TRUE);
		District dt4=this.createDistrict("สกม.1 เพชรบุรี", "เขตการศึกษาประถามศึกษาที่ 1 ", "78 หมู่ 9 เพชรบุรี ", "http://www.sdddd4.go.th",Boolean.FALSE);
		
		this.districts.addAll(Arrays.asList(new District[]{dt1, dt2,dt3,dt4}));
	}	

	
	public District createDistrict(String d_name, String d_fullName, String address,String district_url,Boolean isDH) {
		District district = new District();
		district.setDistrictName(d_name);
		district.setDistrictFullName(d_fullName);
		district.setDistrictAddress(address);
		district.setDistrictUrl(district_url);
		district.setIsDistrictHighschool(isDH);

		return district;
	}	
	
	
	public void save(District district){
		this.districts.add(district);
		System.out.println("Service Add school : Add 1 District :"+district.toString());
	}

}
