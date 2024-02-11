package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utill.Coach;

@RestController
public class funrestcontroller {

    private Coach mycoach;
    private Coach myanothercoach;
    @Autowired
    public funrestcontroller(
            @Qualifier("cricketcoach") Coach thecoach,
    @Qualifier("cricketcoach") Coach theanothercoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        mycoach = thecoach;
        myanothercoach = theanothercoach;

    }
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World!";
    }

    @GetMapping("/check")
    public String check(){
        return "The new instances are same or not :- "+(myanothercoach == mycoach);
    }

    @GetMapping("/workout")
    public String workout()
    {
        return mycoach.getdailyworkout();
    }
}
