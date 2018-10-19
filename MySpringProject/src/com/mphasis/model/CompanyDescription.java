package com.mphasis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_registration")
public class CompanyDescription {
@Id
@Column(name="cusn")
private String cusn;
@Column(name="description")
private String desc;
@Column(name="sq_ansone")
private String securityAnsOne;
@Column(name="sq_anstwo")
private String securityAnsTwo;
public String getCusn() {
	return cusn;
}
public void setCusn(String cusn) {
	this.cusn = cusn;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getSecurityAnsOne() {
	return securityAnsOne;
}
public void setSecurityAnsOne(String securityAnsOne) {
	this.securityAnsOne = securityAnsOne;
}
public String getSecurityAnsTwo() {
	return securityAnsTwo;
}
public void setSecurityAnsTwo(String securityAnsTwo) {
	this.securityAnsTwo = securityAnsTwo;
}
public CompanyDescription() {
	super();
}

}
