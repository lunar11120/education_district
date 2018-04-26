package com.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.model.NewsTopic;


@Repository("newsRepository")
public class NewsRepositoryImpl implements NewsRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<NewsTopic> find_all_News() {
		System.out.println("News Repository | load_all_News_List | Start run Query");
		
		TypedQuery<NewsTopic> query = em.createNamedQuery(NewsTopic.FIND_ALL_NEWS, NewsTopic.class);


		System.out.println("News Object"+query.toString());		
		System.out.println("NEWS DATA:"+query.getResultList().get(0).toString());

		return query.getResultList();
		
	}

}
