package com.mphasis.model;

import java.io.FileInputStream;
import java.util.Date;

import javax.persistence.Column;
//import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentRegister {
@Column(name="uername")
private String uername;
@Column(name="name")
private String name;
@Column(name="branch")
private String branch;
@Column(name="fname")
private String fname;
@Column(name="mname")
private String mname;
@Column(name="dob")
private Date dob;
@Column(name="blood_group")
private String blood_group;
@Column(name="phone_number")
private int phone_number;
@Column(name="alt_number")
private int alt_number;
@Column(name="email")
private String email;
@Column(name="photo")
FileInputStream document;
public FileInputStream getDocument() {
	return document;
}
public void setDocument(FileInputStream document) {
	this.document = document;
}
public String getUername() {
	return uername;
}
public void setUername(String uername) {
	this.uername = uername;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getBlood_group() {
	return blood_group;
}
public void setBlood_group(String blood_group) {
	this.blood_group = blood_group;
}
public int getPhone_number() {
	return phone_number;
}
public void setPhone_number(int phone_number) {
	this.phone_number = phone_number;
}
public int getAlt_number() {
	return alt_number;
}
public void setAlt_number(int alt_number) {
	this.alt_number = alt_number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public StudentRegister() {
	super();
}
}