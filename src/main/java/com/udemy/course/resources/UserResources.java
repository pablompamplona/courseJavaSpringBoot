package com.udemy.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.entities.Users;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<Users> findAll() {
		Users u = new Users(1L, "Maria", "maria@gmail.com", "99887766", "12345");
		return ResponseEntity.ok().body(u);
		
	}

}
