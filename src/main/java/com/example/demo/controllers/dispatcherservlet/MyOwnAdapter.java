package com.example.demo.controllers.dispatcherservlet;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyOwnAdapter implements HandlerAdapter{

    @Override
	public boolean supports(Object handler) {
		return handler instanceof MyCustomHandler;
	}

    @Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Yeah... Custom Adapter reporting!!!");
        MyCustomHandler ch = (MyCustomHandler)handler;
        ch.func(request, response);
		return null;
	}
     
}