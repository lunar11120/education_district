package com.edu.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.edu.model.District;

public class Mk_DistrictService {
	
	private List<District> districts = new LinkedList<District>();
	
	public void createDistrictList(){		
		District dt1=this.createDistrict("ʾ�.1 ���", "ࢵ����֡�ҷ�� 1 ʾ� ��ا෾��ҹ��", "44/8 �Ҵ����� ", "http://www.sc1.com",Boolean.TRUE);
		District dt2=this.createDistrict("ʾ�.2 �������", "ࢵ����֡�ҷ�� 2 ʾ� �������", "53/2 �.�ҧ����-�ù��� ", "http://www.sc12.go.th",Boolean.TRUE);
		District dt3=this.createDistrict("ʾ�.3 ��طû�ҡ��", "ࢵ����֡�ҷ�� 3 ʾ� ��طû�ҡ��", "23.5 ����7 �.�ҧ���·ͧ ", "http://www.sc14.go.th",Boolean.TRUE);
		District dt4=this.createDistrict("ʡ�.1 ྪú���", "ࢵ����֡�һ�ж���֡�ҷ�� 1 ", "78 ���� 9 ྪú��� ", "http://www.sdddd4.go.th",Boolean.FALSE);
		
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
