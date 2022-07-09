package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
@Controller
public class HelloController {

	@GetMapping("/aaa")
	@ResponseBody
	public Object hello(){
		System.out.println("-------aaa----------");
		return null;
	}

}
