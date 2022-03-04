package com.te.project.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.project.Dto.Admin;
import com.te.project.Dto.Coaches;
import com.te.project.Dto.User;
import com.te.project.dao.CoachDaolayer;
import com.te.project.dao.Dao;
import com.te.project.dao.MyDaoLayer;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	MyDaoLayer dao;
	
	@Autowired
	Dao admindao;
	
	@Autowired
	CoachDaolayer coachDao;

//	public boolean validateUserName(User user) {
//		String userName = user.getUserName();
//		String s = "((?=.*[A-Za-z]).{1,20})";
//		Pattern pattern = Pattern.compile(s);
//		Matcher matcher = pattern.matcher(userName);
//		boolean matches = matcher.matches();
//		return matches;
//	}
//
//	public boolean validatePassword(User user) {
//		String password = user.getPassword();
//		String s = "((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*]).{8,20})";
//		Pattern pattern = Pattern.compile(s);
//		Matcher matcher = pattern.matcher(password);
//		boolean matches = matcher.matches();
//		return matches;
//	}
//	
//	public boolean validateAdminName(Admin admin) {
//		String adminName = admin.getAdminName();
//		String s = "((?=.*[A-Za-z]).{1,20})";
//		Pattern pattern = Pattern.compile(s);
//		Matcher matcher = pattern.matcher(adminName);
//		boolean matches = matcher.matches();
//		return matches;
//	}
//
//	public boolean validatePassword(Admin admin) {
//		String password = admin.getPassword();
//		String s = "((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*]).{8,20})";
//		Pattern pattern = Pattern.compile(s);
//		Matcher matcher = pattern.matcher(password);
//		boolean matches = matcher.matches();
//		return matches;
//	}

	@Override
	public User register(User user) {
//		boolean validateUserName = validateUserName(user);
//		boolean validatePassword = validatePassword(user);
		if (user != null) {
			User thisUser = dao.save(user);
			return thisUser;
		} else {
			throw new RuntimeException("something went wrong");
		}

	}

	@Override
	public Admin register(Admin admin) {
//		boolean validateAdminName = validateAdminName(admin);
//		boolean validatePassword = validatePassword(admin);
		if ( admin != null) {
			 Admin save = admindao.save(admin);
			return save;
		} else {
			throw new RuntimeException("something went wrong");
		}

	}

	@Override
	public void delete(User user) {
		dao.delete(user);
	}

	@Override
	public Coaches insert(Coaches coaches) {
		if(coaches!=null) {
			Coaches save = coachDao.save(coaches);
			return save;
		}else {
			throw new RuntimeException("something went wrong");
		}

	}
}
