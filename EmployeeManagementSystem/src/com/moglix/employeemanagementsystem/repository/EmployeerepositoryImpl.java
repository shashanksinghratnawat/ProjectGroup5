package com.moglix.employeemanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.service.EmployeeService;

public class EmployeerepositoryImpl implements EmployeeRepository {

	private EmployeerepositoryImpl() {
		
	}
	
	private static EmployeeRepository employeeRepository;
	
	public static EmployeeRepository getInstance() {
	
		
		if(employeeRepository == null)
		{
			employeeRepository = new EmployeerepositoryImpl();
			return employeeRepository;
		}
		
		else
		{
			return employeeRepository;
		}
		
	}
	private static int counter=0;
	
	
	
	
	//Employee employees[] = new Employee[10];
	
	
	private List<Employee>  employees = new ArrayList<>();
	
	@Override
	public String addEmpployee(Employee employee) {
		boolean result = employees.add(employee);
		if(result) {
			return "Successed";
			
		}
		else
			return "Failed";
	}
	
	
//	private int getIndex(String id) {
//		
//		for(int i =0 ; i<employees.length;i++) {
//			if(employees[i]!=null && employees[i].getEmpID().equals(id)) {
//				return i;
//			}
//		}
//		return -1;
//	}
//
//	@Override
//	public String updateEmployee(String id, Employee employee) {
//
//		int index = this.getIndex(id);
//		
//		if(index!=-1) {
//			
//			employees[index]= employee;
//			return "Success";
//		}
//		else
//			return "Not Found";
//	}
//
//	@Override
//	public Employee getEmployeeById(String id) {
//
//		for(Employee employee : employees) {
//			if(employee!=null && id.equals(employee.getEmpID())) {
//			
//			return employee;
//		    }	
//			
//		}
//		
//		return null;
//		
//	}
//
//	@Override
//	public Employee[] getEmployees() {
//		// TODO Auto-generated method stub
//		return employees;
//	}
//
//	@Override
//	public String deleteEmployeeById(String id) {
//
//		int index=this.getIndex(id);
//		if(index!=-1) {
//			employees[index]=null;
//		return "success";
//		}
//		else 
//			return "not found";
//	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employees= null;

	}


	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
