package com.saw.springboot.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoxerCoach implements Coach
{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in boxing practice";
    }
}
