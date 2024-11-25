package com.saw.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class BallballCoach implements Coach {

    // add constructor
    public BallballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout () {
        return "Spend 30 minutes in batting practice";
    }
}
