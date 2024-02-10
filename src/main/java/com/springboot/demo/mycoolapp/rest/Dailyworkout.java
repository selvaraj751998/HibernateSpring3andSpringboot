package com.springboot.demo.mycoolapp.rest;

import org.springframework.stereotype.Component;

@Component
public class Dailyworkout implements Coach{
    @Override
    public String getdailyworkout() {
        return "fast bowler bowl 15min continously!!!";
    }
}
