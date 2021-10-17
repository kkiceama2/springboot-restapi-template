package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.vo.UserVo;

@RestController
@RequestMapping("/user/v1/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	// 전체 user 조회
	@GetMapping(path = "/")
	public void getUser() {
		
	}
	
	// 특정 user 조회
	@GetMapping(path = "/{userId}")
	public void getUserbyId(@RequestParam String userId) {
		
	}
	
	// 특정 user 생성
	@PostMapping(path = "/{userId}")
	public void setUserbyId(@RequestParam String userId
			              , @RequestBody UserVo userVo) {
		
	}
	
	// 특정 user 정보 수정
	@PutMapping(path = "/{userId}")
	public void updateUserbyId(@RequestParam String userId) {
		
	}
	
	// 특정 user 삭제
	@DeleteMapping(path = "/{userId}")
	public void deleteUserbyId(@RequestParam String userId) {
		
	}
}
