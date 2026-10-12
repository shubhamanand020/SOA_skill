package com.klu.patientservice.Entity;

public class Patient {
	private int id;
	private String docname;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String Docname) {
		this.docname=Docname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description= description;
	}
	
}
