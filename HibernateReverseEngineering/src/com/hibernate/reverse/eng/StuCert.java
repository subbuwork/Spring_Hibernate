package com.hibernate.reverse.eng;

// Generated Feb 22, 2017 6:04:36 PM by Hibernate Tools 4.3.1

/**
 * StuCert generated by hbm2java
 */
public class StuCert implements java.io.Serializable {

	private int sid;
	private int cid;

	public StuCert() {
	}

	public StuCert(int sid, int cid) {
		this.sid = sid;
		this.cid = cid;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

}
