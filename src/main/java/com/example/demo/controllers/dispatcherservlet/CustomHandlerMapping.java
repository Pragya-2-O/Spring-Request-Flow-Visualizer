package com.example.demo.controllers.dispatcherservlet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.HandlerExecutionChain;
import jakarta.servlet.http.HttpServletRequest;

@Order(0) //Means this will be the first in the order of HandlerMappings
@Component
public class CustomHandlerMapping implements HandlerMapping {
     
    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        if(request.getRequestURI().contains("/custom")){
            if(request.getMethod().equals("GET"))
                return new HandlerExecutionChain(new MyCustomHandler());
        }
        return null;
    }
   
}
