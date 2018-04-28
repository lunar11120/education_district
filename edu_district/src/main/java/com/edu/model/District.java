package com.edu.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = District.FIND_ALL_DISTRICT , query =  "SELECT g FROM District g"),
	@NamedQuery(name = District.FIND_ALL_HIGHSCHOOL , query = "SELECT g FROM District g where g.isDistrictHighschool=True"  ),
	@NamedQuery(name = District.FIND_ALL_PRIMARYSCHOOL , query = "SELECT g FROM District g where g.isDistrictHighschool=False"  )	
})
public class District {
	
	public static final String FIND_ALL_DISTRICT = "findAllDistrict";
	public static final String FIND_ALL_HIGHSCHOOL = "findAll_highSchool";	
	public static final String FIND_ALL_PRIMARYSCHOOL = "findAll_primarySchool";	
	
	@Id
	@GeneratedValue
	private int did;
	private String districtName;
	private String districtFullName;
	
	@Column(name="address")
	private String districtAddress;
	
    @Column
    @ElementCollection(targetClass=String.class,fetch=FetchType.EAGER)
	private List<String> telePhone;
	private String fax;
	
	@Column(name="url")
	private String districtUrl;
	
	private Boolean isDistrictHighschool;
	
	@OneToMany(targetEntity=School.class, mappedBy="district", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<School> schools;
	
	

	public Boolean getIsDistrictHighschool() {
		return isDistrictHighschool;
	}

	public void setIsDistrictHighschool(Boolean isDistrictHighschool) {
		this.isDistrictHighschool = isDistrictHighschool;
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictFullName() {
		return districtFullName;
	}

	public void setDistrictFullName(String districtFullName) {
		this.districtFullName = districtFullName;
	}

	public String getDistrictAddress() {
		return districtAddress;
	}

	public void setDistrictAddress(String districtAddress) {
		this.districtAddress = districtAddress;
	}

	

	public List<String> getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(List<String> telePhone) {
		this.telePhone = telePhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getDistrictUrl() {
		return districtUrl;
	}

	public void setDistrictUrl(String districtUrl) {
		this.districtUrl = districtUrl;
	}

	@Override
	public String toString() {
		return "District [did=" + did + ", districtName=" + districtName + ", districtFullName=" + districtFullName
				+ ", districtAddress=" + districtAddress + ", telePhone=" + telePhone + ", districtUrl=" + districtUrl
				+ ", isDistrictHighschool=" + isDistrictHighschool + "]";
	}



	
	
}
