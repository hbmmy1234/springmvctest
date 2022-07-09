package com.example.controller;

import com.example.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping(value = "/testJson", method = RequestMethod.POST)
    @ResponseBody
    public Object testJson(@RequestBody User user){
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        System.out.println("----test----");
        return "user";
    }
}
