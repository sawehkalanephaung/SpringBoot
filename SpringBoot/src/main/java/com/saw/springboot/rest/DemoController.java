package com.saw.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String workout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String fortune() {
        return "Today is your very lucky day!";
    }


    // inject the properties for the coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
        private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

}
