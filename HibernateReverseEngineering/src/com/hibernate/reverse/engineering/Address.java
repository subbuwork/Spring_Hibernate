package com.hibernate.reverse.engineering;

// Generated Feb 22, 2017 6:01:37 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address implements java.io.Serializable {

	private int id;
	private String cityName;
	private String countryName;
	private String stateName;
	private String streetName;
	private Integer zipcode;
	private Set students = new HashSet(0);

	public Address() {
	}

	public Address(int id) {
		this.id = id;
	}

	public Address(int id, String cityName, String countryName,
			String stateName, String streetName, Integer zipcode, Set students) {
		this.id = id;
		this.cityName = cityName;
		this.countryName = countryName;
		this.stateName = stateName;
		this.streetName = streetName;
		this.zipcode = zipcode;
		this.students = students;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Integer getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}
