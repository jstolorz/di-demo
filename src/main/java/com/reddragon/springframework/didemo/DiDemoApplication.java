package com.reddragon.springframework.didemo;

import com.reddragon.springframework.didemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

	  	ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController)context.getBean("myController");

		myController.hello();


	}
}
