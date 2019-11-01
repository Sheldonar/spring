package com.fedorg.spring.controller;

import com.fedorg.spring.model.User;
import com.fedorg.spring.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.net.http.HttpClient;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/test1")
    public ModelAndView test1() {
        List<User> users = (List<User>) userRepository.findAll();
        users.forEach(System.out::println);
        ModelAndView modelAndView = new ModelAndView("hello.jsp");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @PostMapping ("/addUser")
    public RedirectView addUser(@ModelAttribute User user){
        userRepository.save(user);
        return new RedirectView("/test1");
    }
}
