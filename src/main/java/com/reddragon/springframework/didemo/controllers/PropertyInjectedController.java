package com.reddragon.springframework.didemo.controllers;

import com.reddragon.springframework.didemo.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
