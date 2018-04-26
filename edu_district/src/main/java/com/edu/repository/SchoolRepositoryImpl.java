package com.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.model.School;

@Repository("schoolRepository")
public class SchoolRepositoryImpl implements SchoolRepository {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unused")
	@Transactional //must import form:import org.springframework.transaction.annotation.Transactional;
	public School SR_save_to_database(School school) {
		
		Integer value = (int) school.getId();
		System.out.println("check value goalID:"+value);
		//(value==null)
		if (value==0) { 			
			System.out.println("SR_save_to_database running");
			em.persist(school);
			em.close();
		}else {
			System.out.println("Entity manager Merge:");
			school = em.merge(school);
		}
		return null;
	}

	@Transactional
	public List<School> load_all_schoolList() {
		System.out.println("school Repository | load_all_schoolList | Start run Query");
		
		TypedQuery<School> query = em.createNamedQuery(School.FIND_ALL_School,School.class);	
		return query.getResultList();
	}	
	
	

}
