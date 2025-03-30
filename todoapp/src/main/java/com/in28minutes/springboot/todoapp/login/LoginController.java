package com.in28minutes.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //    http://localhost:8080/login?name=John
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap modelMap) {
        modelMap.put("name", name);
        System.out.println("name = " + name);
        return "login";
    }
}
