package com.hibernate.reverse.eng;

// Generated Feb 22, 2017 6:04:36 PM by Hibernate Tools 4.3.1

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private int did;
	private String address;
	private String dname;

	public Department() {
	}

	public Department(int did) {
		this.did = did;
	}

	public Department(int did, String address, String dname) {
		this.did = did;
		this.address = address;
		this.dname = dname;
	}

	public int getDid() {
		return this.did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
