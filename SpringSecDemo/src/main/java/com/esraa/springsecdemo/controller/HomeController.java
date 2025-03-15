package com.esraa.springsecdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("hello")
    public String greeting(HttpServletRequest request) {
        return "Hello Spring Security!" + request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "It's me Esraa!" + request.getSession().getId();
    }

}
