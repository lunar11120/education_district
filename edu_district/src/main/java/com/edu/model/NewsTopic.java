package com.edu.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@NamedQuery(name = NewsTopic.FIND_ALL_NEWS , query = "SELECT g FROM NewsTopic g"  )	
public class NewsTopic {
	
	public static final String FIND_ALL_NEWS = "find_All_News";
	
	@Id
	@GeneratedValue
	private int nid;
	private String topic;
	private String newsDetail;
	
	@Column(name="date")
	private String topicDate;
	 
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private java.util.Calendar calendarTimestamp;

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getNewsDetail() {
		return newsDetail;
	}

	public void setNewsDetail(String newsDetail) {
		this.newsDetail = newsDetail;
	}

	public String getTopicDate() {
		return topicDate;
	}

	public void setTopicDate(String topicDate) {
		this.topicDate = topicDate;
	}

	public java.util.Calendar getCalendarTimestamp() {
		return calendarTimestamp;
	}

	public void setCalendarTimestamp(java.util.Calendar calendarTimestamp) {
		this.calendarTimestamp = calendarTimestamp;
	}

	public static String getFindAllNews() {
		return FIND_ALL_NEWS;
	}

	@Override
	public String toString() {
		return "NewsTopic [nid=" + nid + ", topic=" + topic + ", topicDate=" + topicDate + "]";
	}
	


	

}
