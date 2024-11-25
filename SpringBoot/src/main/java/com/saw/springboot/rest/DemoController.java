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
    private final Coach anotherCoach;

    // use default constructor
    // don't forget to add @Autowired
    // what is @autowired? it is used to inject the dependency automatically
    @Autowired
    public  DemoController(@Qualifier("boxerCoach") Coach theCoach,
                           @Qualifier("boxerCoach") Coach theAnotherCoach) {
        // Printline
        System.out.println("In constructor: " + getClass().getSimpleName());

        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
