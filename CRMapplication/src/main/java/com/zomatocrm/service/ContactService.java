package com.zomatocrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Contact;

@Service
public interface ContactService {

	void savee(Contact contact);

	List<Contact> findall();

	public Contact findbyid(Long id);

}
