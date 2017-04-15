package com.myproject.mybean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_LOGIN")
public class MyLoginBean {
	
	private int id;
	private String strUserName;
	private String strFullName;
	private String strPassword;
	
	@Column(name="USER_NAME")
	public String getStrUserName() {
		return strUserName;
	}
	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}
	
	@Column(name="FULL_NAME")
	public String getStrFullName() {
		return strFullName;
	}
	public void setStrFullName(String strFullName) {
		this.strFullName = strFullName;
	}

	@Column(name="PASSWORD")
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

}
