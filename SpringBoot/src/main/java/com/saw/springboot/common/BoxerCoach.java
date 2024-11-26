package com.saw.springboot.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BoxerCoach implements Coach
{

    // add constructor
    public BoxerCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define our destroy method

    // post destroy method, it will be called before the bean is destroyed
    @PostConstruct
    public void doMyCleanupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    // pre destroy method , it will be called after the bean is destroyed
    @PreDestroy
    public void doMyStartupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes in boxing practice";
    }
}
