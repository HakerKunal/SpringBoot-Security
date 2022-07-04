package com.example.sprinsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping( value="login")
    public String index() {
        return "login";
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
