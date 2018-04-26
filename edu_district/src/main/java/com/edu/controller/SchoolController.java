package com.edu.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.model.School;
import com.edu.service.Mk_SchoolService;
import com.edu.service.SchoolService;

@Controller
@RequestMapping(value="/school")
public class SchoolController {
	
	@Autowired
	private Mk_SchoolService sc_service;
	
	@Autowired	
	private SchoolService schoolService;
	
	@SuppressWarnings("serial")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addSchool(Model model){

		model.addAttribute("types", new ArrayList<String>(){{
			add("");
			add("อนุบาล-ประถมศึกษา");
			add("อนุบาล-มัธยมศึกษาตอนต้น ");
			add("อนุบาล-มัธยมศึกษาตอนปลาย");
			add("มัธยมศึกษาตอนต้น-มัธยมศึกษาตอนปลาย ");
		}});
		
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

		schoolService.save(school);
		
		this.sc_service.save(school);
		attributes.addFlashAttribute("school", school);	
		
		return "redirect:/school/add_review";
	}		
	
	@RequestMapping(value="/list_highschool", method = RequestMethod.GET)
	public String listHighschool(Model model) {
		System.out.println("listHighschool : Method ");
		List<School> schools = schoolService.findAllSchool();
		
		System.out.println("schools List: "+schools);
		model.addAttribute("schools",schools);
		
		return "list_highschool";
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
	
}// end class SchoolController
