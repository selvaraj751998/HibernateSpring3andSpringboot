package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utill.Coach;

@RestController
public class funrestcontroller {

    private Coach mycoach;
    @Autowired
    public void setCoach(Coach thecoach){
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
