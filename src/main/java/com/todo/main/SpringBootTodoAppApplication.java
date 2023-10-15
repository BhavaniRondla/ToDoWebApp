package com.todo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.todo.main.controllers.TodoController;

@SpringBootApplication
//@ComponentScan(basePackageClasses=TodoController.class)
public class SpringBootTodoAppApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(SpringBootTodoAppApplication.class, args);
	}

}
