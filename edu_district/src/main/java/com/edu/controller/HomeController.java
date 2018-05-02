package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.edu.model.District;
import com.edu.model.NewsTopic;
import com.edu.model.School;
import com.edu.service.DistrictService;
import com.edu.service.News_Service;
import com.edu.service.SchoolService;

@Controller
@SessionAttributes(value= {"news_objects","school_name"})
public class HomeController {

	@Autowired
	private News_Service news_Object_Service;
	
	@Autowired	
	private DistrictService education_District_Service;	
	
	@Autowired	
	private SchoolService schoolService;	
	
	@RequestMapping(value="/")
	public String goHome(Model model) {
		
		List<NewsTopic> news_objects = news_Object_Service.findAllNews();
		model.addAttribute("news_objects",news_objects);
		
		School school_search= new School();
		model.addAttribute("school_search",school_search);
		
		return "home";
	}
	
	@RequestMapping(value="/editData_district",method=RequestMethod.GET)
	public String editData() {
		return "edit_data_district";
	}
	
	@RequestMapping(value="/editData_Highschool",method=RequestMethod.GET)
	public String editHighschool() {
		return "edit_data_school";
	}
	
	//Search school
	@RequestMapping(value="/search_school",method=RequestMethod.POST)
	public String searchSchool(Model model , @ModelAttribute School school) {
		
		String school_name = school.getSchoolName();
		List<School> schools_find_by_name = schoolService.find_by_Name(school_name);
		
		for(School sc: schools_find_by_name) {
			System.out.print("search result SchoolList : " +sc.getSchoolName());
			System.out.print("search result : " +sc.getSchoolType());
			System.out.println("search result[District]"+sc.getDistrict_id_number());
		}
		
		School school_search= new School();
	
		model.addAttribute("school_search",school_search);
		model.addAttribute("find_school_list",schools_find_by_name);
		return "search_school";
	}	
	
	@ModelAttribute("SchoolList")
	public List<School> getTypeOptions_school(){	
		
		List<School> schools = schoolService.findAllSchool();
		
		for(School sc: schools) {
			System.out.print("SchoolList : " +sc.getSchoolName());
			System.out.print(" : " +sc.getSchoolType());
			System.out.println("[District]"+sc.getDistrict_id_number());
		}

		return schools; 
	}

	@ModelAttribute("districtList")
	public List<District> getTypeOptions_dt(){			
		List<District> districtList = education_District_Service.findAllDistrict();
		return districtList; 
	}
			
	@RequestMapping("/history")
	public String goAboutHistory() {
		return "about_history";
	}
	
	@RequestMapping("/department")
	public String goAboutDepartment() {
		return "about_department";
	}
	

}//end class HomeController
