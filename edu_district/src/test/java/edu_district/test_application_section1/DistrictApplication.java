package edu_district.test_application_section1;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.edu.model.District;

public class DistrictApplication {
	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// test application
		findAll_district2();

	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void findAllDistrict() throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

        // creating seession factory object
        SessionFactory factory = cfg.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        // creating transaction object
        org.hibernate.Transaction t = session.beginTransaction();
        
        //Query query = entityManager. createQuery("Select UserName from **UserDetails** "); 
        String query_find_all = "from"+" ' "+ "District"+" ' ";
        Query query = session.createQuery(query_find_all);
        List list = query.list();
        System.out.println(list);
        t.commit();
        session.close();


	}
	
	public static void findAll_district2() {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

        // creating seession factory object
        @SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();		


		// Get All Employees
		@SuppressWarnings("unused")
		Transaction tx = (Transaction) session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select did, districtName from District");
		@SuppressWarnings("unchecked")
		List<Object[]> rows = query.list();
		for(Object[] row : rows){
			District dc = new District();
			dc.setDid(Integer.parseInt(row[0].toString()));
			dc.setDistrictName(row[1].toString());

			System.out.println(dc);
		}
	}
	


}
