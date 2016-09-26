package com.two95.onesies.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Kid {
	
	private int report_id;
	@NotNull
	@Pattern(regexp = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)")
	private String dateofreport;
	@Size(min = 2,max=15)@NotNull
	@Pattern(regexp = "^[a-zA-Z'-]+$")
	private String fname;
	@Size(min = 2,max=15)@NotNull
	@Pattern(regexp = "^[a-zA-Z'-]+$")
	private String lname;
	private String mood;
	private String remarks;
	private String comments;

	public Kid() {
		super();
	}
	public Kid(String dateofreport, String fname, String lname, String mood, String remarks, String comments) {
		super();
		this.dateofreport = dateofreport;
		this.fname = fname;
		this.lname = lname;
		this.mood = mood;
		this.remarks = remarks;
		this.comments = comments;
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public String getDateofreport() {
		return dateofreport;
	}
	public void setDateofreport(String dateofreport) {
		this.dateofreport = dateofreport;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMood() {
		return mood;
	}
	public void setMood(String mood) {
		this.mood = mood;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
