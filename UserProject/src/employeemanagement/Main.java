package employeemanagement;

import com.moglix.employeemanagementsystem.dto.Role;
import com.moglix.employeemanagementsystem.dto.User;

public class Main {

	public static void main(String[] args) {

		Role R = new Role();
		
		//employee.setEmpID(123);
		R.setRole_Id("ROLE ID is : "+"123");
		R.setRole_Name("ROLE NAME is : "+"ADMIN");
		
		
		//System.out.println(employee.getEmpID());
		System.out.println("\n***** This is Role Table *****\n"+R.getRole_Id());
		System.out.println(R.getRole_Name());
		
		
		User U = new User();
		
		U.setUser_Id("USER Id : "+"123");
		U.setUser_Name("USER NAME : "+"VISHU");
		U.setEmail("USER EMAIL ID : " + "vishal.saini@moglix.com");
		U.setPassword(1234);
		U.setRole_Id("USER ROLE ID : "+"123");
	
		System.out.println("\n *****  This is User Table *****\n"+U.getUser_Id());
		System.out.println(U.getUser_Name());
		System.out.println(U.getPassword());
		System.out.println(U.getRole_Id());
		System.out.println(U.getEmail());
	
		

	}

}
