package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.edu.model.NewsTopic;
import com.edu.service.News_Service;

@Controller
@SessionAttributes(value="news_objects")
public class HomeController {

	@Autowired
	private News_Service news_Object_Service;
	
	@RequestMapping(value="/")
	public String goHome(Model model) {
		
		List<NewsTopic> news_objects = news_Object_Service.findAllNews();
		model.addAttribute("news_objects",news_objects);
		return "home";
	}
	


	
	@RequestMapping("/about")
	public String goAbout() {
		return "about";
	}
	
	

}
