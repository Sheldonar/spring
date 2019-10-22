package com.fedorg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/test")
    public String test() {
        System.out.println("hello world");
        return "Hello.html";
    }

    @GetMapping("/test1")
    public ModelAndView test1() {
        System.out.println("bye world");
        return new ModelAndView("hello.jsp", "ASD", new String());
    }
}
