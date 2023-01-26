package com.kaustav.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.kaustav.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freepass;
	
	@CourseCode(value="LUV", message="must start with LUV")
	private String coursecode;

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public String getFirstName() {
		return firstName;
	}

	public Integer getFreepass() {
		return freepass;
	}

	public void setFreepass(Integer freepass) {
		this.freepass = freepass;
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
	
	
	
}
