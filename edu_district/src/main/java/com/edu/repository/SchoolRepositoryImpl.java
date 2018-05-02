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
	
	@Transactional
	public School getBySchoolId(long id) {
		School school = new School();
		school = em.getReference(School.class, id);
		System.out.println("check school object"+school.toString());
		return school;
	}

	@Transactional
	public void deleteSchool(long school_id) {
		School school = new School();
		school = em.getReference(School.class, school_id);
		school.setIsActive(Boolean.FALSE);
		em.close();

		System.out.println("delete school object");
		
	}

	public List<School> find_by_Name(String school_name) {
		
		System.out.println("school Repository | Search | find_by_Name [schoolname =]"+school_name);
		
		TypedQuery<School> query = em.createNamedQuery(School.FIND_BY_NAME,School.class).setParameter("school_name", school_name);	
		return query.getResultList();
		

	}	
	
	

}
