package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.User;

public class UserRepositoryImpl implements UserRepository {

	private UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static UserRepository UserRepository;
	
    public static UserRepository getInstance() {
	
		
		if(UserRepository == null)
		{
			UserRepository = new UserRepositoryImpl();
			return UserRepository;
		}
		
		else
		{
			return UserRepository;
		}
		
	}

	private static int counter=0;

	User users[] = new User[10];
	
	
	@Override
	public String addUser(User user) {
			if(counter<users.length) {
			
			users[counter++] = user;
			return "success";
		}
		
		else
			return "Array is full!!!!";
	}

	
private int getIndex(String id) {
		
		for(int i =0 ; i<users.length;i++) {
			if(users[i]!=null && users[i].getUser_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public String updateUser(String id, User user) {
		int index = this.getIndex(id);
		
		if(index!=-1) {
			
			users[index]= user;
			return "Success";
		}
		else
			return "Not Found";
	}

	@Override
	public User getUserById(String id) {
		for(User user : users) {
			if(user!=null && id.equals(user.getRole_Id())) {
			
			return user;
		    }	
			
		}
		
		return null;
		
	}

	@Override
	public User[] getUser() {
		return users;
		
		
	}

	@Override
	public String deleteUserById(String id) {
		int index=this.getIndex(id);
		if(index!=-1) {
			users[index]=null;
		return "success";
		}
		else 
			return "not found";
	}


	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		
	}

}
