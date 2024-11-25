package com.saw.springboot.rest;

import com.saw.springboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

   // create setter  for dependency injection
    private Coach myCoach;

    // you can define any name "setMyCoach"
    // don't forget to add @Autowired
    // what is @autowired? it is used to inject the dependency automatically
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
