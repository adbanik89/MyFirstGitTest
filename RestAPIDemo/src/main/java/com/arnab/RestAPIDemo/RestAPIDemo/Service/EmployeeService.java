package com.arnab.RestAPIDemo.RestAPIDemo.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arnab.RestAPIDemo.RestAPIDemo.Model.Employee;

@Service
public interface EmployeeService {
		public List<Employee> addEmployee(Employee emp);
		public List<Employee> viewAllEmployee();
		public Employee viewEmployeeById(int empId);
		public Employee updateEmployee (int empId);
		public Employee deleteEmployee(int empId);		
}
