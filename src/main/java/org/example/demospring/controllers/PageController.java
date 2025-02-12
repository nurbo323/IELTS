package org.example.demospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/register")
    public String getRegisterPage() {
        return "IELTS";
    }

    @GetMapping("/registration")
    public String showRegistrationPage() {
        return "registration";
    }

}
