package com.StockManagementSystem.StockManagementSystemAPI.Tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminDetails 
{
	@Id
	@Column
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String password;

	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDetails(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDetails [id=" + id + ", username=" + username + ", password=" + password + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	

	
}
