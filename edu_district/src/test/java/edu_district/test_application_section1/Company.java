package edu_district.test_application_section1;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="company_am")
public class Company {
	
	@Id
	@Column(name="id_company")
	private int companyId;
	
	@Column(nullable=false , name="company_name")
	private String companyName;
	
	@Column(nullable=false)
	private String companySetIndex;
	
	@Transient
	private String address;
	
	@Basic
	private boolean isPermanant;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySetIndex() {
		return companySetIndex;
	}

	public void setCompanySetIndex(String companySetIndex) {
		this.companySetIndex = companySetIndex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isPermanant() {
		return isPermanant;
	}

	public void setPermanant(boolean isPermanant) {
		this.isPermanant = isPermanant;
	}
	
	
	
}