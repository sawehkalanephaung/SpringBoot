package com.saw.springboot.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {

    // add constructor
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
@Override
public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes !!!!!!";
}


}