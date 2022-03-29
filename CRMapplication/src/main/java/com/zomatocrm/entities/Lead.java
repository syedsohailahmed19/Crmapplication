package com.zomatocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Leads")
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", length=40, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length=40, nullable = false)
	private String lasttName;
	
	@Column(name = "email", length=40, nullable = false, unique = true)
	private String email;
	
	@Column(name = "mobile", length=40, nullable = false, unique = true)
	private String mobile;
	
	@Column(name = "lead_source", nullable = false)
	private String leadSource;

	
	
	
	
	public Lead() {
	}

	public Lead(String firstName, String lasttName, String email, String mobile, String leadSource) {
		
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.mobile = mobile;
		this.leadSource = leadSource;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}


}
