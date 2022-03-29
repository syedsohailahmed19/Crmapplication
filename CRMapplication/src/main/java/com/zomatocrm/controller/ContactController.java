package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Contact;
import com.zomatocrm.entities.Lead;
import com.zomatocrm.service.ContactService;
import com.zomatocrm.service.LeadService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService conserv;
	
	@Autowired
	private LeadService leadserv;
	
	@RequestMapping("/savecontact")
	public String savecontact(@RequestParam("id") Long id, ModelMap model) {
		Lead lead = leadserv.findleadbyid(id);
		Contact contact = new Contact(lead.getFirstName(), lead.getLasttName(), lead.getEmail(), lead.getMobile(), lead.getLeadSource());
		conserv.savee(contact);
		leadserv.deletebyid(id);
		model.addAttribute("contact", contact);
		
		return "contact_info";
	}
	
	@RequestMapping("/contactslist")
	public String contactlist(ModelMap model) {
		List<Contact> contacts = conserv.findall();
		model.addAttribute("contacts", contacts);
		return "contacts_list";
	}

}
