package edu_district.test_application_section1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.edu.model.District;
import com.edu.model.School;
import com.edu.service.Mk_DistrictService;
import com.edu.service.Mk_SchoolService;

public class TestDistrict {

	public static void main(String[] args) {
		
		createDistrict_And_School(); // Create sample data : District and school
	}
	
	@SuppressWarnings("deprecation")
	public static void createDistrict_And_School() {
		
		//create table district & school
		Configuration config = new Configuration();
		config.addAnnotatedClass(District.class);
		config.addAnnotatedClass(School.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		System.out.println("Company config complete");
		
		//create session
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		//Insert data to database
		Mk_DistrictService mk_district = new Mk_DistrictService();		
		District dt1=mk_district.createDistrict("สพม.1 กทม", "เขตการศึกษาที่ 1 สพฐ กรุงเทพหมานคร", "44/8 ลาดพร้าว ", "http://www.sc1.com",Boolean.TRUE);
		District dt2=mk_district.createDistrict("สพม.2 นนทบุรี", "เขตการศึกษาที่ 2 สพฐ นนทบุรี", "53/2 ถ.บางกรวย-ไทรน้อย ", "http://www.sc12.go.th",Boolean.TRUE);
		District dt3=mk_district.createDistrict("สพม.3 สมุทรปราการ", "เขตการศึกษาที่ 3 สพฐ สมุทรปราการ", "23.5 หมู่7 ถ.บางห้วยทอง ", "http://www.sc14.go.th",Boolean.TRUE);
		District dt4=mk_district.createDistrict("สกม.1 เพชรบุรี", "เขตการศึกษาประถามศึกษาที่ 1 ", "78 หมู่ 9 เพชรบุรี ", "http://www.sdddd4.go.th",Boolean.FALSE);
		
		Mk_SchoolService mk_school = new Mk_SchoolService();
		School sc1=mk_school.createSchool("โรงเรียนสวนกุหลาบวิทยาลัย สมุทรปราการ", "มัธยมศึกษาตอนปลาย", "http://www.sc1.com");
		School sc2=mk_school.createSchool("โรงเรียนราชวินิต บางเขน", "มัธยมศึกษาตอนปลาย", "http://www.sc2.com");
		School sc3=mk_school.createSchool("โรงเรียนเทพสิรินทร์", "มัธยมศึกษาตอนต้น-มัธยมศึกษาตอนปลาย", "http://www.thepp.edu.co.th");
		
		sc1.setDistrict(dt2);
		sc2.setDistrict(dt1);
		sc3.setDistrict(dt1);
		
		session.save(dt1);
		session.save(dt2);
		session.save(dt3);
		session.save(dt4);
		session.save(sc1);
		session.save(sc2);
		session.save(sc3);

		session.getTransaction().commit();
		System.out.println("=====createDistrict_And_School====: success");
	}

}
