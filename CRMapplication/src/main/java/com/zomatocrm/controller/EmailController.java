package com.zomatocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.utilities.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailservice;
	
	
	@RequestMapping("/compose")
	public String Composeemail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email",email);
		return "email_creator";
	}
		
	
@RequestMapping("/email")
public String sendeemail(@RequestParam("email") String email, @RequestParam("subject") String subject, @RequestParam("Message") String message, ModelMap model) {
emailservice.sendSimpleMessage(email, subject, message);
model.addAttribute("msg", "email sent");
	return "email_creator";
		}
	

}
