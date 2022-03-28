package com.home.simpleapp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@ConditionalOnProperty(prefix = "service", value = "third")
@Configuration
public class ThirdConfig {

    @PostConstruct
    void checkBean(){
        System.out.printf("\n Hello! I'm living, %s\n", this.getClass());
    }
}
