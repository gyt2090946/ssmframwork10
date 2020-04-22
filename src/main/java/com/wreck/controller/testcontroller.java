package com.wreck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {
    @RequestMapping("/test")
    private String test(){
        return "testturn";
    }
}
