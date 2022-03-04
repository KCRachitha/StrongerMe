package com.te.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.project.Dto.Admin;
import com.te.project.Dto.Coaches;
import com.te.project.Dto.User;
import com.te.project.Dto.UserRes;
import com.te.project.service.MyService;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	@Autowired
	MyService service;

//	@PostMapping("/user")
//	public ResponseEntity<UserRes> register(@RequestBody User user) {
//		User register = service.register(user);
//		UserRes userRes = new UserRes();
//		userRes.setData(register);
//		userRes.setError(false);
//		System.out.println("hii");
//		return new ResponseEntity<UserRes>(userRes, HttpStatus.OK);
//
//	}
//	@PostMapping("/admin")
//	public ResponseEntity<UserRes> register(@RequestBody Admin admin){
//		Admin adminregister = service.register(admin);
//		UserRes userRes = new UserRes();
//		userRes.setError(false);
//		userRes.setData(adminregister);
//		return new ResponseEntity<UserRes>(userRes,HttpStatus.OK);
//		
//	}
//	@DeleteMapping("/delete")
//	public void delete(@RequestParam Integer id,User user) {
//		service.delete(user);
//	}
	
	@PostMapping("/insert")
	public ResponseEntity<UserRes> insert(@RequestBody Coaches coaches){
		Coaches insert = service.insert(coaches);
		UserRes userRes = new UserRes();
		userRes.setData(insert);
		userRes.setError(false);
		return new ResponseEntity<UserRes>(userRes,HttpStatus.OK);
		
	}
		


}
