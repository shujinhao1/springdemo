package com.shu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class UserController {
    @RequestMapping("/index")
    public String index(){
        System.out.println(1);
        return "index";
    }
}



