package com.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.model.District;

@Repository("districtRepository")
public class DistrictRepositoryImpl implements DistrictRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional //must import form:import org.springframework.transaction.annotation.Transactional;
	public District DT_save_to_database(District district) {
		
		Integer value = (int) district.getDid();
		System.out.println("check value DID:"+value);
		//(value==null)
		if (value==0) { 			
			System.out.println("DT_save_to_database running");
			em.persist(district);
			em.close();
		}else {
			System.out.println("Entity manager Merge:District");
			district = em.merge(district);
		}
		return null;		
	}

	public List<District> load_all_district() {
		System.out.println("District Repository | load_all_district | Start run Query");
		
		TypedQuery<District> query = em.createNamedQuery(District.FIND_ALL_DISTRICT, District.class);	
		return query.getResultList();
	}

}
