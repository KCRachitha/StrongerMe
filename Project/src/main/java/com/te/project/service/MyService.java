package com.te.project.service;

import com.te.project.Dto.Admin;
import com.te.project.Dto.Coaches;
import com.te.project.Dto.User;


public interface MyService {
	public User register(User user);
	
	public Admin register(Admin admin);
	
	public void delete(User user);
	
	public Coaches insert(Coaches coaches); 
		
	

}
