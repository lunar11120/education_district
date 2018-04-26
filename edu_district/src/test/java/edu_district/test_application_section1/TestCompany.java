package edu_district.test_application_section1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestCompany {

	public static void main(String[] args) {
		// test application
		insertCompany();

	}

	@SuppressWarnings("deprecation")
	public static void insertCompany() {
		
		//create table and data
		Configuration config = new Configuration();
		config.addAnnotatedClass(Company.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		System.out.println("Company config complete");
		
		//create session
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		//Insert data to database
		Company com1 = new Company();
		com1.setCompanyId(200);
		com1.setCompanyName("Sement Thai company");
		com1.setCompanySetIndex("SCC");
		com1.setAddress("43/45 ratchadapisek");
		
		Company com2 = new Company();
		com2.setCompanyId(201);
		com2.setCompanyName("Thai Oil");
		com2.setCompanySetIndex("THO");
		com2.setAddress("33 Ladphao rd. bangkok");
		
		session.save(com1);
		session.save(com2);
		session.getTransaction().commit();
		System.out.println("Insert Object to database complete" +com1+ ':' +com2);
	}	

}
