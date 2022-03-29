package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
	@GetMapping("/viewleadpage")
	public String viewsavepage() {
	return "save_lead";	
	}
	
	@PostMapping("/savelaed")
	public String savelead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadservice.savelead(lead);
		model.addAttribute("lead", lead);
		return "leadinfo";
	}
	
	@RequestMapping("/leadslist")
	public String listleads(ModelMap model) {
		List<Lead> lead = leadservice.findleads();
		model.addAttribute("lead", lead);
		return "list_leads";
	}
	
	@RequestMapping("/leadbyid")
	public String leaddetails(@RequestParam("id") Long id, ModelMap model) {
		Lead lead = leadservice.findleadbyid(id);
		model.addAttribute("lead", lead);
		return "leadinfo";
		
	}
	
	@RequestMapping("/deletebyid")
	public String delete(@RequestParam("id") Long id, ModelMap model) {
		leadservice.deletebyid(id);
		List<Lead> lead = leadservice.findleads();
		model.addAttribute("lead", lead);
		return "list_leads";
	}
	
	@RequestMapping("/updatedetails")
	public String updatedetails(@RequestParam("id") Long id, ModelMap model) {
		Lead lead = leadservice.findrecord(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}

	@RequestMapping("/updateddetails")
	public String updateleaddetails(Lead lead, ModelMap model) {
		leadservice.savelead(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "record updated");
		
		return "leadinfo";
		
	}
	
}
