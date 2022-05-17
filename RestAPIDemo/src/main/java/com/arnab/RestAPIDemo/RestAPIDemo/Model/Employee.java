package com.arnab.RestAPIDemo.RestAPIDemo.Model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private EmployeeName empName;
	private EmployeeAddress empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public EmployeeName getEmpName() {
		return empName;
	}
	public void setEmpName(EmployeeName empName) {
		this.empName = empName;
	}
	public EmployeeAddress getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
}
