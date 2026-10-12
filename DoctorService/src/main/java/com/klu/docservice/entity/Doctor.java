package com.klu.docservice.entity;

public class Doctor {
	private int id;
	private String docname;
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setDocname(String docname) {
		this.docname=docname;
	}
	public String getDocname() {
		return docname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role=role;
	}	
}
