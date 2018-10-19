package com.mphasis.model;

import java.io.FileInputStream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="student_degree")

public class StudentDegree {
	@Column(name="percentage")
	private int per;
	@Column(name="yop")
	private int year;
	@Column(name="board")
	private String board;

	@Column(name="upload_documents")

	FileInputStream document;

	public StudentDegree() {
		super();
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public FileInputStream getDocument() {
		return document;
	}

	public void setDocument(FileInputStream document) {
		this.document = document;
	}


}
