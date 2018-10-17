package com.mphasis.companyusers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_users")
public class CompanyUsers {
	@Id
	@Column(name="c_user_name")
	private String userName;
	@Column(name="password")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CompanyUsers() {
		super();
	}
	

}
