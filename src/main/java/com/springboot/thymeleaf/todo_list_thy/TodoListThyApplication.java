package com.springboot.thymeleaf.todo_list_thy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TodoListThyApplication extends SpringBootServletInitializer {

	private  static final Logger log = LoggerFactory.getLogger(TodoListThyApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TodoListThyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoListThyApplication.class, args);
	}

}
