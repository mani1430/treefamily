package com.treefamily.treefamily.Onboarding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@RequestMapping("") //index
public class OnboardingController {

    @GetMapping("")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }

    @GetMapping("register")
    @ResponseBody
    public String register(){
        return "Register!";
    }
}
