package com.saw.springboot.common;


import org.springframework.stereotype.Component;

@Component
public class VolleballCoach implements Coach {

    // add constructor
    public VolleballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
