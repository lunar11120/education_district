package edu_district.test_application_section1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


import com.edu.model.NewsTopic;



public class TestNews {
	
	public static void main(String[] args) throws ParseException, SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		//dataTimeTest();
		createNewsTopic();
		
	}	
	
	
	@SuppressWarnings("deprecation")
	public static void createNewsTopic() throws ParseException {
		
		//create table district & school
		Configuration config = new Configuration();
		config.addAnnotatedClass(NewsTopic.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		System.out.println("Company config complete");
		
		//create session
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		//Insert data to database
		NewsTopic n1 = new NewsTopic();
		NewsTopic n2 = new NewsTopic();
		NewsTopic n3 = new NewsTopic();
		NewsTopic n4 = new NewsTopic();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2018,3,18);



		System.out.println(sdf.format(calendar.getTime()));
		
	    String timeStamp = new SimpleDateFormat("dd-MM-yyyy : HHmmss").format(Calendar.getInstance().getTime());
	    System.out.println("TimeStamp : "+timeStamp);
	    
	    String timeStamp_topic = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
	    System.out.println("TimeStamp_add_to_Topic : "+timeStamp_topic);
	    
		n1.setTopic("�������ԧ��Ժѵԡ�� ��ѡ�ٵ� ����������ͧ������Ѻ���֡�͹");
		n1.setNewsDetail("��Ҥ�������� (�������) ���Թ�ҹ�������������оѲ�ҡ������㹻�������ҵ����� 2551 �����ִ��������º��Ժѵ� "
				+ "��Т�ͺѧ�Ѻ����騴����¹��Ҥ���ͷҧ�Ҫ��� �ա���������㹾ѹ��Ԩ��������� �Ѳ�� �����������ؤ�ҡ÷ҧ��á������㹻������ ");
		n1.setTopicDate(timeStamp_topic);


		n2.setTopic("ʾ�. �Դ��ͧ�ҧ㹡���Ѻ�ѧ�����Դ��繴�ҹ��ҧ�");
		n2.setNewsDetail("�����ӹѡ�ҹ��С�����á���֡�Ң�鹾�鹰ҹ ��з�ǧ�֡�Ҹԡ�� �Դ��ͧ�ҧ㹡�õԴ���������áѺ�����ҹ���䫵� �����Ѻ�ѧ��ͤԴ��繢���ʹ���㹴�ҹ��ҧ�");
		n2.setTopicDate(timeStamp_topic);

		
		n3.setTopic("�������¹�ŧ��䢢�����ʶҹ�֡��");
		n3.setNewsDetail("�óշ������¹�ŧ��䢢�����ʶҹ�֡������˹����纤�ҧ��� email �ҷ�� 3hhg@obec.go.th �Ф�Ѻ");
		n3.setTopicDate(timeStamp_topic);

		
		n4.setTopic("�ع�Ѱ����ԧ���� �дѺ�Ѹ���֡�� ��Шӻա���֡�� 2562");
		n4.setNewsDetail("���¡�з�ǧ�֡�Ҹԡ���ԧ���� ��С���Ѻ��Ѥ÷ع�Ѱ����ԧ���� �дѺ�Ѹ���֡�� ��Шӻ� 2562 �����֡�ҵ����дѺ�Ѹ���֡�ҵ͹��\r\n" + 
				"���͵͹����㹻�����ԧ���� �ҡʹ㨵Դ�����������´���� https://www.moe.gov.sg/admissions/scholarships/asean/thailand ");
		n4.setTopicDate(timeStamp_topic);
		
		
		session.save(n1);
		session.save(n2);
		session.save(n3);
		session.save(n4);
		
		System.out.println("record Data:"+n1.toString());
		System.out.println("record Data:"+n2.toString());

		session.getTransaction().commit();
		System.out.println("=====create_News_Topic====: success");
	}
	
	public static void findnews() {
		return ;

	}	
	
	public static void dataTimeTest() {
	     // Instantiate a Date object
	     Date date = new Date();

	     // display time and date using toString()
	     System.out.println(date.toString());
	     
	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      
	      SimpleDateFormat ft2 = 
	      new SimpleDateFormat ("dd-MM-yyyy");

	      System.out.println("Current Date: " + ft.format(dNow));
	      System.out.println("ft2 = "+ft2.format(dNow));
	      
	      String timeStamp = new SimpleDateFormat("dd-MM-yyyy : HHmmss").format(Calendar.getInstance().getTime());
	      System.out.println("TimeStamp : "+timeStamp);
	}

}
