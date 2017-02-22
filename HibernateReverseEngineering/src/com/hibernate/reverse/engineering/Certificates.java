package com.hibernate.reverse.engineering;

// Generated Feb 22, 2017 6:01:37 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Certificates generated by hbm2java
 */
public class Certificates implements java.io.Serializable {

	private int cid;
	private String DName;
	private String UName;
	private Date year;
	private Integer sid;

	public Certificates() {
	}

	public Certificates(int cid, String DName, String UName, Date year) {
		this.cid = cid;
		this.DName = DName;
		this.UName = UName;
		this.year = year;
	}

	public Certificates(int cid, String DName, String UName, Date year,
			Integer sid) {
		this.cid = cid;
		this.DName = DName;
		this.UName = UName;
		this.year = year;
		this.sid = sid;
	}

	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getDName() {
		return this.DName;
	}

	public void setDName(String DName) {
		this.DName = DName;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

}
