package com.example.HomeWork1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("hello")
	@ResponseBody
	public String myName(@RequestParam(name = "location") String location,
			@RequestParam(name = "name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

	@RequestMapping("index")
	@ResponseBody
	public String mainPage() {
		return "This is the main page.";
	}

	@RequestMapping("contact")
	@ResponseBody
	public String contactPage() {
		return "This is the contact page.";
	}
}
