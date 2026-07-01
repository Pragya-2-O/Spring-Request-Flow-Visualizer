package com.example.demo.controllers.myinterf;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Adder implements Controller {
    //Controller is an interface in Java.
    //Controllers are handlers created during run-time.
    
    //We are defining this controller to tackle any request made to "/add"

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int sum = Integer.parseInt(request.getParameter("a")) + Integer.parseInt(request.getParameter("b"));
        response.getWriter().write("{Sum : "+sum+" } ");
        
        return null;
    }

}
