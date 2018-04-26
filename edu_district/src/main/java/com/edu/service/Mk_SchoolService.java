package com.edu.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.edu.model.School;

public class Mk_SchoolService {
	
	private List<School> schools = new LinkedList<School>();
	
	public void createSchoolList(){
		School sc1=this.createSchool("�ç���¹�ǹ����Һ�Է����� ��طû�ҡ��", "�Ѹ���֡�ҵ͹����", "http://www.sc1.com");
		School sc2=this.createSchool("�ç���¹�Ҫ�ԹԵ �ҧࢹ", "�Ѹ���֡�ҵ͹����", "http://www.sc2.com");
		School sc3=this.createSchool("�ç���¹෾���Թ���", "�Ѹ���֡�ҵ͹��-�Ѹ���֡�ҵ͹����", "http://www.thepp.edu.co.th");
		
		this.schools.addAll(Arrays.asList(new School[]{sc1, sc2, sc3}));
	}	
	
	public void save(School school){
		this.schools.add(school);
		System.out.println("Service Add school : Add 1 school :"+school.toString());
	}
	
	public School createSchool(String school_name, String school_type, String school_url) {
		School school = new School();
		school.setSchoolName(school_name);
		school.setSchoolType(school_type);
		school.setSchoolUrl(school_url);

		return school;
	}	
}
