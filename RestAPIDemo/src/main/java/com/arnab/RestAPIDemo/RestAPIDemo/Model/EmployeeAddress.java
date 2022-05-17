package com.arnab.RestAPIDemo.RestAPIDemo.Model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeAddress {
	private String empAddress;
	private int empZipCode;
	private String state;
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpZipCode() {
		return empZipCode;
	}
	public void setEmpZipCode(int empZipCode) {
		this.empZipCode = empZipCode;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
