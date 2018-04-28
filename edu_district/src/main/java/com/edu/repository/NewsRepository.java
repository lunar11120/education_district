package com.edu.repository;
import java.util.List;

import com.edu.model.NewsTopic;

public interface NewsRepository {
	List<NewsTopic> find_all_News();
	NewsTopic getNewsTopicbyID(int id);
}
