package com.example.demo.jwt;

import com.example.demo.jwt.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		List<User> userList = new ArrayList<>();
//		userList.add(new User(1L,"user1","user1", "user1", 100, new HashSet<>()));
//		userList.add(new User(2L,"user2","user2", "user2", 200, new HashSet<>()));
//		userList.add(new User(3L,"user3","user3", "user3", 300, new HashSet<>()));
//		userList.add(new User(4L,"user4","user4", "user4", 400, new HashSet<>()));
//		userList.add(new User(5L,"user5","user5", "user5", 500, new HashSet<>()));
//
//		String NAME_FILTER = "user";
//		double totalSalary = 0;
//
//		totalSalary = userList.stream().filter(u -> u.getUsername().contains(NAME_FILTER))
//				.mapToDouble(u -> u.getSalary()).sum();
//
//		System.out.println("Sum user of salary "+ totalSalary);

		SpringApplication.run(DemoApplication.class, args);
	}

}
