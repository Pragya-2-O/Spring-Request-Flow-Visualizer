package com.example.demo.controllers.myinterf;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;


@Configuration
@EnableWebMvc  //Gives a signal to Spring MVC 
public class MyOwnConfig {

    @Bean
    public HandlerMapping CreateOwnHM(){
        
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        Map<String, Controller> urlMap = new HashMap<>();
        urlMap.put("/add", new Adder());
        simpleUrlHandlerMapping.setUrlMap(urlMap);
        return simpleUrlHandlerMapping;
    }

}
