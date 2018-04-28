package com.edu.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.model.District;
import com.edu.model.School;
import com.edu.service.DistrictService;
import com.edu.service.Mk_SchoolService;
import com.edu.service.SchoolService;

@Controller
@RequestMapping(value="/school")
public class SchoolController {
	
	@Autowired
	private Mk_SchoolService sc_service;
	
	@Autowired	
	private SchoolService schoolService;
	
	@Autowired	
	private DistrictService education_District_Service;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addSchool(Model model){
		
		model.addAttribute("school", new School());
	
		return "add_school/page1_addschool";
	}
	
	//add high school section ============================================
	@RequestMapping(value="/add_highschool" ,method=RequestMethod.GET)
	public String addHighSchool(Model model){
		
		model.addAttribute("school", new School());
		
		return "add_school/add_highschool";
	}		


	
	@RequestMapping(value="/add_highschool" ,method=RequestMethod.POST)
	public String addHighSchool(@ModelAttribute School school, RedirectAttributes attributes){
		
		System.out.println("Invoking Save High School.");
		school.setDistrictType(Boolean.TRUE);
		System.out.println("SAVE:"+school.toString());
		
		if(school.getDistrict_id_number() != 0) {
			District d1 = education_District_Service.find_by_id(school.getDistrict_id_number());
			school.setDistrict(d1);
		}
		
		schoolService.save(school);
		
		this.sc_service.save(school);
		attributes.addFlashAttribute("school", school);	
		
		return "redirect:/school/add_review";
	}		
	
	@RequestMapping(value="/list_highschool", method = RequestMethod.GET)
	public String listHighschool(Model model) {
		System.out.println("listHighschool : Method ");
			
		List<District> district_highschool = education_District_Service.findAll_dsitrictHighschool();
		
		for(District d: district_highschool) {
			System.out.print("DistrictList : " +d.getDistrictName());
			System.out.print(" : " +d.getDistrictFullName());
			System.out.println("[School]"+d.getSchools());
		}
		
		model.addAttribute("district_highschool",district_highschool);
		
		return "list_highschool";
	}
	

	@RequestMapping(value="/list_primaryschool", method = RequestMethod.GET)
	public String listPrimaryschool(Model model) {
		System.out.println("listPrimaryschool : Method ");
		List<District> district_pschool = education_District_Service.findAll_dsitrictPrimaryschool();
		
		for(District d: district_pschool) {
			System.out.print("DistrictList : " +d.getDistrictName());
			System.out.print(" : " +d.getDistrictFullName());
			System.out.println("[School]"+d.getSchools());
		}
		
		model.addAttribute("district_pschool",district_pschool);
		
		return "list_primaryschool";
	}	
	
	//add primary school section =============================================
	@RequestMapping(value="/add_primaryschool" ,method=RequestMethod.GET)
	public String addPrimarySchool(Model model){
		
		model.addAttribute("school", new School());
		
		return "add_school/add_primaryschool";
	}	
	
	@RequestMapping(value="/add_primaryschool" ,method=RequestMethod.POST)
	public String addPrimarySchool(@ModelAttribute School school, RedirectAttributes attributes){
		
		System.out.println("Invoking Save Primary School.");
		school.setDistrictType(Boolean.FALSE);
		System.out.println("SAVE:"+school.toString());

		schoolService.save(school);
		
		this.sc_service.save(school);
		attributes.addFlashAttribute("school", school);	
		
		return "redirect:/school/add_review";
	}	
	
	//School review page
	@RequestMapping(value="/add_review" ,method=RequestMethod.GET)
	public String schoolReviewPage(@ModelAttribute School school){
		
		System.out.println("schoolReviewPage:"+school.toString());
		
		return "add_school/add_review";
	}		
	
	@ModelAttribute("typeOptions_hs")
	public List<String> getTypeOptions(){					
		return new LinkedList<String>(Arrays.asList(new String[] {
				"มัธยมศึกษาตอนต้น-มัธยมศึกษาตอนปลาย","อนุบาล-มัธยมศึกษาตอนต้น","อนุบาล-มัธยมศึกษาตอนปลาย"
				})); 
	}	
	
	@ModelAttribute("typeOptions_ps")
	public List<String> getTypeOptions_ps(){					
		return new LinkedList<String>(Arrays.asList(new String[] {
				"อนุบาล-ประถมศึกษา","อนุบาล-มัธยมศึกษาตอนต้น","อนุบาล-มัธยมศึกษาตอนปลาย"
				})); 
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
	
	@ModelAttribute("districtListMap")
	public Map< Integer, String > getTypeOptions_Map(){	
		
		Map< Integer, String > districtMap = new HashMap<Integer, String>();
		List<District> districtList = education_District_Service.findAllDistrict();
		
		for(District d: districtList) {
			System.out.print("DistrictList : " +d.getDistrictName());
			System.out.print(" : " +d.getDistrictFullName());
			System.out.println("[School]"+d.getSchools());				
			districtMap.put(d.getDid(),d.getDistrictName());
		}
		
		return districtMap; 
		
	}
	
}// end class SchoolController
