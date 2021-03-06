package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.Role;

public class RoleRepositoryImpl implements RoleRepository {

	private RoleRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static RoleRepository roleRepository;
	
    public static RoleRepository getInstance() {
	
		
		if(roleRepository == null)
		{
			roleRepository = new RoleRepositoryImpl();
			return roleRepository;
		}
		
		else
		{
			return roleRepository;
		}
		
	}

	private static int counter=0;

	Role roles[] = new Role[10];
	
	
	@Override
	public String addRole(Role role) {
			if(counter<roles.length) {
			
			roles[counter++] = role;
			return "success";
		}
		
		else
			return "Array is full!!!!";
	}

	
private int getIndex(String id) {
		
		for(int i =0 ; i<roles.length;i++) {
			if(roles[i]!=null && roles[i].getRole_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public String updateRole(String id, Role role) {
		int index = this.getIndex(id);
		
		if(index!=-1) {
			
			roles[index]= role;
			return "Success";
		}
		else
			return "Not Found";
	}

	@Override
	public Role getRoleById(String id) {
		for(Role role : roles) {
			if(role!=null && id.equals(role.getRole_Id())) {
			
			return role;
		    }	
			
		}
		
		return null;
		
	}

	@Override
	public Role[] getRoles() {
		return roles;
		
		
	}

	@Override
	public String deleteRoleById(String id) {
		int index=this.getIndex(id);
		if(index!=-1) {
			roles[index]=null;
		return "success";
		}
		else 
			return "not found";
	}

	@Override
	public void deleteAllRole() {
		// TODO Auto-generated method stub
		roles=null;
	}

}
