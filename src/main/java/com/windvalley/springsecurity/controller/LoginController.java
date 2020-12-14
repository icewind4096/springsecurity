package com.windvalley.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    /**
     * 登录
     */
    @RequestMapping("/login")
    public String Login(){
        return "redirect:main.html";
    }
}
