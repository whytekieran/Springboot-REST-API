package com.whyte.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApp {

	public static void main(String[] args) {
		//Start the Spring Boot app, create servlet and host it, thats it.
		SpringApplication.run(SpringApiApp.class, args);

		/*This will build a course API with three resources, Topic, Course, Lesson. A topic
		can have multiple courses and a course can have multiple lessons*/
	}

}
