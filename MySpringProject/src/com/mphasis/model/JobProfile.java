package com.mphasis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_profile")
public class JobProfile {
@Id
@Column(name="cusn")
private String userName;
@Column(name="job_location")
private String jLocation;
@Column(name="ssc")
private String ssc;
@Column(name="hsc")
private String graduation;
@Column(name="no_of_posts")
private String noOfPosts;
@Column(name="interview_process")
private String interviewProcess;

public JobProfile() {
	super();
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getjLocation() {
	return jLocation;
}
public void setjLocation(String jLocation) {
	this.jLocation = jLocation;
}
public String getSsc() {
	return ssc;
}
public void setSsc(String ssc) {
	this.ssc = ssc;
}
public String getGraduation() {
	return graduation;
}
public void setGraduation(String graduation) {
	this.graduation = graduation;
}
public String getNoOfPosts() {
	return noOfPosts;
}
public void setNoOfPosts(String noOfPosts) {
	this.noOfPosts = noOfPosts;
}
public String getInterviewProcess() {
	return interviewProcess;
}
public void setInterviewProcess(String interviewProcess) {
	this.interviewProcess = interviewProcess;
}
}
