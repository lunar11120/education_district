package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.model.NewsTopic;
import com.edu.service.News_Service;

@Controller
@RequestMapping(value="/newstopic")
public class NewsTopicController {
	
	@Autowired
	private News_Service news_Object_Service;
	
	@RequestMapping(value="/{nid}")
	public String showNews(Model model,@PathVariable("nid") Integer nid) {
		
		NewsTopic news_object = new NewsTopic();		
		news_object = news_Object_Service.findByID(nid);
		model.addAttribute("news_topic" , news_object);

		return "news_topic";
	}
}
