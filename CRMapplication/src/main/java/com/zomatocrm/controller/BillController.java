package com.zomatocrm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Bills;
import com.zomatocrm.entities.Contact;
import com.zomatocrm.service.BillsService;
import com.zomatocrm.service.ContactService;

@Controller
public class BillController {
	
	@Autowired
	private ContactService conserv;
	
	@Autowired
	private BillsService billservice;
	
	@RequestMapping("/billing")
	private String findbilldetails(@RequestParam("id") Long id, ModelMap model) {
		Contact contact = conserv.findbyid(id);
		model.addAttribute("contact", contact);
		return "bill_amount";
	}
	

	@RequestMapping("/savebill")
	public String savebill(Bills bill,ModelMap model) {
		billservice.save(bill);
		model.addAttribute("bill", bill);
		return "bills_info";
	}
	
	@RequestMapping("/bills")
	public String billslist(ModelMap model) {
		List<Bills> bill = billservice.findallbills();
		model.addAttribute("bill", bill);
		return "bills_list";
	}




}
