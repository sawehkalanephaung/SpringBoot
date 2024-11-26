package com.saw.springboot.rest;

import com.saw.springboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    private final  Coach myCoach;

    // use default constructor
    // don't forget to add @Autowired
    // what is @autowired? it is used to inject the dependency automatically

    // spring beans
    @Autowired
    public  DemoController(@Qualifier("swimCoach") Coach theCoach){
        // Printline
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
