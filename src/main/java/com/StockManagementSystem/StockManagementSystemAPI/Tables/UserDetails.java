package com.StockManagementSystem.StockManagementSystemAPI.Tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long user_id;
	
	@Column
	private String username;
	
	@Column
	private String emailid;
	
	@Column
	private long mobno;
	
	@Column
	private long mobno2;
	
	@Column
	private String aadharid;
	
	@Column
	private String pancardid;
	
	@Column
	private byte isactive;
	
	@Column
	private byte isdeleted;

	@Override
	public String toString() {
		return "UserDetails [user_id=" + user_id + ", username=" + username + ", emailid=" + emailid + ", mobno="
				+ mobno + ", mobno2=" + mobno2 + ", aadharid=" + aadharid + ", pancardid=" + pancardid + ", isactive="
				+ isactive + ", isdeleted=" + isdeleted + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public UserDetails(long user_id, String username, String emailid, long mobno, long mobno2, String aadharid,
			String pancardid, byte isactive, byte isdeleted) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.emailid = emailid;
		this.mobno = mobno;
		this.mobno2 = mobno2;
		this.aadharid = aadharid;
		this.pancardid = pancardid;
		this.isactive = isactive;
		this.isdeleted = isdeleted;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public long getMobno2() {
		return mobno2;
	}

	public void setMobno2(long mobno2) {
		this.mobno2 = mobno2;
	}

	public String getAadharid() {
		return aadharid;
	}

	public void setAadharid(String aadharid) {
		this.aadharid = aadharid;
	}

	public String getPancardid() {
		return pancardid;
	}

	public void setPancardid(String pancardid) {
		this.pancardid = pancardid;
	}

	public byte getIsactive() {
		return isactive;
	}

	public void setIsactive(byte isactive) {
		this.isactive = isactive;
	}

	public byte getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(byte isdeleted) {
		this.isdeleted = isdeleted;
	}


}


//user_id bigint auto_increment,
//username varchar(100),
//emailid varchar(250),
//mobno numeric,
//mobno2 numeric,
//aadharid varchar(20),
//pancardid varchar(20),
//address varchar(400),
//isactive bit,
//isdeleted bit,