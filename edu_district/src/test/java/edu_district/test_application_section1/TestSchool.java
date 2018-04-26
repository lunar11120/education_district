package edu_district.test_application_section1;

import java.util.ArrayList;
import java.util.List;

import com.edu.model.School;
import com.edu.service.SchoolServiceImpl;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		load_Schoollist();

	}
	
	public static void load_Schoollist() {
		
		System.out.println("Test app running");
		List<School> schools = new ArrayList<School>();
		
		SchoolServiceImpl ss = new SchoolServiceImpl();
		schools = ss.findAllSchool();
		
		System.out.println("List:"+schools);
	}

}
