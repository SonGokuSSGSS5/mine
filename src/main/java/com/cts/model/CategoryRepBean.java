package com.cts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name="categoryrep")
public class CategoryRepBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer categoryRepId;	
	
	private String firstName;
	private String lastName;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dob;
	private String gender;
	
	@Pattern(regexp="\\d{10}",message="Please enter the number of 10 digits PROPERLY!!")
	private String phno;
	private String Category;
	private String password;
	
	public Integer getCategoryRepId() {
		return categoryRepId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setCategoryRepId(Integer categoryRepId) {
		this.categoryRepId = categoryRepId;
	}

	
	public CategoryRepBean() {
		super();
	}
	
	public CategoryRepBean(Integer categoryRepId, String firstName, String lastName, Date dob, String gender,
			@Pattern(regexp = "\\d{10}", message = "Please enter the number of 10 digits PROPERLY!!") String phno,
			String category, String password) {
		super();
		this.categoryRepId = categoryRepId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.phno = phno;
		Category = category;
		this.password = password;
	}
	
	
	
	
	
	
	
	
}
