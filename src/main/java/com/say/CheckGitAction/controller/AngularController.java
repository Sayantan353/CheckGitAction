package com.say.CheckGitAction.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngularController {

    @RequestMapping(value={"/{path:[^\\\\.]*}/{subPath:[^\\\\.]*}"})
    public String redirectAng(HttpServletRequest request){
        System.out.println("Inside Angular Controller-----");
        return "forward:/index.html";
    }
}
