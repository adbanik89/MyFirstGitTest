package com.arnab.RestAPIDemo.RestAPIDemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arnab.RestAPIDemo.RestAPIDemo.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> empList = new ArrayList<>();
	@Override
	public List<Employee> addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empList.add(emp);	
		return empList;
	}

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public Employee viewEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee e1=null;
		for(Employee e : empList) {
			if(e.getEmpId()== empId) {
				e1=e;
			}			
		}
		return e1;
	}

	@Override
	public Employee updateEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
