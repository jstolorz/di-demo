package com.reddragon.springframework.didemo;

import com.reddragon.springframework.didemo.controllers.ConstructorInjectedController;
import com.reddragon.springframework.didemo.controllers.MyController;
import com.reddragon.springframework.didemo.controllers.PropertyInjectedController;
import com.reddragon.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

	  	ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController)context.getBean("myController");

		myController.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());


	}
}
