package com.saw.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class BoxerCoach implements Coach
{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in boxing practice";
    }
}
