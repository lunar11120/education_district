package com.edu.controller;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.model.District;
import com.edu.service.DistrictService;

@Controller
@RequestMapping(value="/district")
public class DistrictController {

	@Autowired	
	private DistrictService education_District_Service;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addDistrict(Model model) {
		
		System.out.println("Invoking add district");
		model.addAttribute("district", new District());
		return "add_district/add_district";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addDistrict(@ModelAttribute District district) {
				
		education_District_Service.save(district);
		System.out.println("save completed | district data:"+district.toString());
		
		return "home";
	}	
	
	
	@ModelAttribute("radioOptions")
	public List<String> getRadios(){
		return new LinkedList<String>(Arrays.asList(new String[] {
				"เขตพื้นที่การศึกษามัธยมศึกษา", "เขตพื้นที่การศึกษาประถามศึกษา"	
			}));
	}

	
}//end class DistrictController
