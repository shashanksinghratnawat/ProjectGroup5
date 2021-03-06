package com.moglix.employeemanagmentsystem;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.service.EmployeeService;
import com.moglix.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee();

		// EmployeeServiceDemo employeeServiceDemo = new EmployeeServiceDemo();

		EmployeeServiceImpl employeeServiceDemo = EmployeeService.getInstance();

		employee.setEmpID("123");
		employee.setEmpFirstName("Vishal");
		employee.setEmpLastname("Saini");
		employee.setEmpSalary(100000);
		employee.setPanCard("IYMPS77232");
		employee.setAadhar("123456332");
		employee.setAddress("H>NO>100");

		// System.out.println(employee.getEmpID());
		// System.out.println(employee.getEmpSalary());

		
		  
		  String result = employeeServiceDemo.addEmpployee(employee);
		  System.out.println(result);
		 
		 

		Employee employee2 = employeeServiceDemo.getEmployeeById("123");

		if (employee2 == null) {

			System.out.println("Not Exists");

		}

		else {
			System.out.println("EXISTS");
		}

		Employee employees[] = employeeServiceDemo.getEmployees();

		for (Employee employee3 : employees) {
			if (employee3 != null) {
				System.out.println(employee3);
				System.out.println(employee3.toString());
			}
		}

		// employeeService.deleteAllEmployees();

		String updateStatus = employeeServiceDemo.updateEmployee("Vissss", employee);
		System.out.println(updateStatus);

	}

}
