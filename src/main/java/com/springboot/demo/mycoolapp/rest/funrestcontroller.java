package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utill.Coach;

@RestController
public class funrestcontroller {

    private Coach mycoach;
    @Autowired
    public funrestcontroller(@Qualifier("cricketcoach") Coach thecoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        mycoach = thecoach;
    }
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String workout()
    {
        return mycoach.getdailyworkout();
    }
}
