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
import com.edu.service.DistrictService;
import com.edu.service.News_Service;

@Controller
@SessionAttributes(value="news_objects")
public class HomeController {

	@Autowired
	private News_Service news_Object_Service;
	
	@Autowired	
	private DistrictService education_District_Service;	
	
	@RequestMapping(value="/")
	public String goHome(Model model) {
		
		List<NewsTopic> news_objects = news_Object_Service.findAllNews();
		model.addAttribute("news_objects",news_objects);
		return "home";
	}
	
	@RequestMapping(value="/editData_district",method=RequestMethod.GET)
	public String editData() {
		return "edit_data_district";
	}
	
	@ModelAttribute("districtList")
	public List<District> getTypeOptions_dt(){	
		
		List<District> districtList = education_District_Service.findAllDistrict();
		
		for(District d: districtList) {
			System.out.print("DistrictList : " +d.getDistrictName());
			System.out.print(" : " +d.getDistrictFullName());
			System.out.println("[School]"+d.getSchools());
		}

		return districtList; 
	}	

		
	
	@RequestMapping("/about")
	public String goAbout() {
		return "about";
	}
	
	

}//end class HomeController
