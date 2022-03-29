package com.zomatocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 45, nullable = false)
	private String Lasttname;
	
	@Column(name = "email", length = 45, nullable = false)
	private String email;
	
	@Column(name = "mobile", length = 45, nullable = false)
	private String mobile;
	
	@Column(name = "product_name", length = 45, nullable = false)
	private String productName;
	
	@Column(name = "amount", length = 45, nullable = false)
	private int amount;

	
	
	public Bills() {
	}

	public Bills(String firstName, String lasttname, String email, String mobile, String productName, int amount) {
		super();
		this.firstName = firstName;
		Lasttname = lasttname;
		this.email = email;
		this.mobile = mobile;
		this.productName = productName;
		this.amount = amount;
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

	public String getLasttname() {
		return Lasttname;
	}

	public void setLasttname(String lasttname) {
		Lasttname = lasttname;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
	
	
	
	
	
	

	
	
	
}
