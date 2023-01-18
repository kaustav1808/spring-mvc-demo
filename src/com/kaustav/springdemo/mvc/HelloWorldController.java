package com.kaustav.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
  @RequestMapping("/show")	
  public String show() {
	  return "helloWorldForm";
  }
  
  @RequestMapping(value="/process", method=RequestMethod.POST)
  public String process(HttpServletRequest request, Model model) {
	  String name = request.getParameter("name");
	  String modifiedName = "Yo !!  " + name;
	  
	  model.addAttribute("name", modifiedName);
	  
	  return "helloWorld";
  }
} 
