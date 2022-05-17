package com.arnab.RestAPIDemo.RestAPIDemo.Model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeName {
	
	private String empFName;
	private String empLname;
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpLname() {
		return empLname;
	}
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}

}
