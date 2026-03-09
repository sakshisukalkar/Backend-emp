package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.User;
import com.Service.UserService;
import com.dto.userdto;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService uresp;
	
	@PostMapping("/registration")
	public String registration(@RequestBody User u)
	{
		return uresp.registration(u);
	}
	@PostMapping("/login")
	public ResponseEntity<?>login(@RequestBody userdto dto)
	{
		User existinguser= uresp.login(dto);
		if(existinguser!=null)
		{
			return ResponseEntity.ok(existinguser);
		}
		
		else
		{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body("Invalid username or password");
		}
	}
	

}
