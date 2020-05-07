package com.ragh.springdemo.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ragh.springdemo.mvc.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	/* 3rd way */
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		/* 3rd way */
		model.addAttribute("theCountryOptions", countryOptions);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("Inside");
		return "student-confirmation";
	}
}
