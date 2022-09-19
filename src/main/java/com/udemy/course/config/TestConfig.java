package com.udemy.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.udemy.course.entities.Client;
import com.udemy.course.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClientRepository ur;

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Client c2 = new Client(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		ur.saveAll(Arrays.asList(c1, c2));
	}

}
