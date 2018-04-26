package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.model.NewsTopic;
import com.edu.repository.NewsRepository;


@Service("news_Object_Service")
public class News_ServiceImpl implements News_Service {

	@Autowired
	private NewsRepository newsRepository;	

	public List<NewsTopic> findAllNews() {
		return newsRepository.find_all_News();
	}
	


}
