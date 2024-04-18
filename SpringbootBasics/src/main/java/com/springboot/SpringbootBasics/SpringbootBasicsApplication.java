package com.springboot.SpringbootBasics;

import com.springboot.SpringbootBasics.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootBasicsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootBasicsApplication.class, args);
		//Initializes the spring container

		Student s1 = context.getBean(Student.class); //will create an object to Student class
		s1.displayHello();
		Student s2 = context.getBean(Student.class);
		s2.displayHello();


		System.out.println("Hello world!");
	}

}
