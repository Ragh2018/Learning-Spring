package com.ragh.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShout(HttpServletRequest request,Model model)
	{
		String thename= request.getParameter("studentName");
		
		thename="YO "+thename.toUpperCase();
	
		model.addAttribute("message", thename);
		
		return "helloworld";
	}
}
