package com.reddragon.springframework.didemo.controllers;

import com.reddragon.springframework.didemo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
