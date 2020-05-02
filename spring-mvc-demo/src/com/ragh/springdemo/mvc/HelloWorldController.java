package com.ragh.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Parent mapping
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersion2")
	public String letsShout(HttpServletRequest request, Model model) {
		String thename = request.getParameter("studentName");

		thename = "YO " + thename.toUpperCase();

		model.addAttribute("message", thename);

		return "helloworld";
	}

	@RequestMapping("/processFormVersion3")
	public String letsShout2(@RequestParam("studentName") String thename, Model model) {
		thename = "YO " + thename.toUpperCase();

		model.addAttribute("message", thename);

		return "helloworld";
	}
}
