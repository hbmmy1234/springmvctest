package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping(value = "/firstController")
public class FirstController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest httpServletRequest,
								HttpServletResponse httpServletResponse, Model model) throws Exception {
		System.out.println("----handleRequest 111------");
		//向模型对象中添加数据
		model.addAttribute("msg", "这是我的第一个springMVC项目");
		//返回视图页面
		return "first";
	}

}
