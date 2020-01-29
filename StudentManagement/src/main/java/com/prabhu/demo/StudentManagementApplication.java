package com.prabhu.demo;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.prabhu.demo.controller.repository.StudentRepo;
import com.prabhu.demo.datamodel.Contact;
import com.prabhu.demo.datamodel.Student;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(StudentRepo repository) {
		return args -> {
			Contact c = new Contact();
			c.setAddressLine1("Post box no:01");
			c.setCity("Coimbatore");
			c.setDistirct("Coimbatore");
			c.setMobilePhone1("8784844446545");

			repository.save(new Student("Raj", "Britto", new Date(), c, new ArrayList<>()));
			repository.save(new Student("Kiran", "Stephen", new Date(), c, new ArrayList<>()));
		};
	}

}
