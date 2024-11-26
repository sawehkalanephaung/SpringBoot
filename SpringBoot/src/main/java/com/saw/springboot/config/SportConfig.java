package com.saw.springboot.config;

import com.saw.springboot.common.Coach;
import com.saw.springboot.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    // by default the bean id is swimCoach
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
