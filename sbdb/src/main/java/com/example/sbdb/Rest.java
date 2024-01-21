package com.example.sbdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Rest {
	
	StudentDAOClass sdc;

	public Rest() {
		super();
	}

	@Autowired
	public Rest(StudentDAOClass sdc) {
		super();
		this.sdc = sdc;
	}
	
	@GetMapping("/home") 
	public String home(){
	 
		return "home";
	}
	
	@PostMapping("/Register")
	public String register(@ModelAttribute("Stud2") Student stud2)
	{
		sdc.insertStudent(stud2);
		return"register";
	}
	
	
	@GetMapping("/form") 
	public String form(){
	return "form";
	}
	
	@GetMapping("/properties") 
	public String prop(){
	return "properties";
	}
	
	@GetMapping("/aboutus") 
	public String abts(){
	return "aboutus";
	}
	
	@GetMapping("/login") 
	public String lgn(){
	return "login";
	}
	
	@GetMapping("/response")
	public String rps() {
		return "response";
	}
	
	@GetMapping("/thankyou")
	public String tq() {
		return "thankyou";
	}
	
	@GetMapping("/module2")
	public String module2() {
		return "md2";
	}
	
	
}
