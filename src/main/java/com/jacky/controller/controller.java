package com.jacky.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fine/",method = RequestMethod.GET)
public class controller {
    @RequestMapping(value = "hello")
    public Object say(String name){
        System.out.println(name);
        return name;
    }
}
