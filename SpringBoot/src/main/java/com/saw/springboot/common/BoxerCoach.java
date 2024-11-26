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



    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes in boxing practice";
    }
}
