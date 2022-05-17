package com.arnab.RestAPIDemo.RestAPIDemo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.arnab.RestAPIDemo.RestAPIDemo.Model.Employee;
import com.arnab.RestAPIDemo.RestAPIDemo.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empObj;
	
	@RequestMapping(value = "/addEmployee", method=RequestMethod.POST)
	public List<Employee> addEmployeeToList(@RequestBody Employee emp){
		return empObj.addEmployee(emp); 
	}
	
	@RequestMapping(value = "/viewAllEmployee", method=RequestMethod.GET)
	public List<Employee> viewAllEmp() {
		 List <Employee> empList = empObj.viewAllEmployee();
		 return empList;
	}
	
	@RequestMapping(value = "/viewEmployeeById/{empId}", method=RequestMethod.GET)
	public Employee viewEmpById(@PathVariable("empId") int empId) {
		Employee emp = empObj.viewEmployeeById(empId);
		return emp;
	}
	
	
}
