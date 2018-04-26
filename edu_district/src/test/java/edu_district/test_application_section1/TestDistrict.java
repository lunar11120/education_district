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
		District dt1=mk_district.createDistrict("ʾ�.1 ���", "ࢵ����֡�ҷ�� 1 ʾ� ��ا෾��ҹ��", "44/8 �Ҵ����� ", "http://www.sc1.com",Boolean.TRUE);
		District dt2=mk_district.createDistrict("ʾ�.2 �������", "ࢵ����֡�ҷ�� 2 ʾ� �������", "53/2 �.�ҧ����-�ù��� ", "http://www.sc12.go.th",Boolean.TRUE);
		District dt3=mk_district.createDistrict("ʾ�.3 ��طû�ҡ��", "ࢵ����֡�ҷ�� 3 ʾ� ��طû�ҡ��", "23.5 ����7 �.�ҧ���·ͧ ", "http://www.sc14.go.th",Boolean.TRUE);
		District dt4=mk_district.createDistrict("ʡ�.1 ྪú���", "ࢵ����֡�һ�ж���֡�ҷ�� 1 ", "78 ���� 9 ྪú��� ", "http://www.sdddd4.go.th",Boolean.FALSE);
		
		Mk_SchoolService mk_school = new Mk_SchoolService();
		School sc1=mk_school.createSchool("�ç���¹�ǹ����Һ�Է����� ��طû�ҡ��", "�Ѹ���֡�ҵ͹����", "http://www.sc1.com");
		School sc2=mk_school.createSchool("�ç���¹�Ҫ�ԹԵ �ҧࢹ", "�Ѹ���֡�ҵ͹����", "http://www.sc2.com");
		School sc3=mk_school.createSchool("�ç���¹෾���Թ���", "�Ѹ���֡�ҵ͹��-�Ѹ���֡�ҵ͹����", "http://www.thepp.edu.co.th");
		
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
