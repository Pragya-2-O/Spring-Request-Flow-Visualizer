package com.example.demo.controllers.dispatcherservlet;

import java.io.IOException;

import org.springframework.web.HttpRequestHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyCustomHandler {

    public void func(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("Handled by custom guys!");
    }
}