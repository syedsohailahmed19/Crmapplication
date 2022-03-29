package com.zomatocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Contact;
import com.zomatocrm.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository conrepo;
	
	@Override
	public void savee(Contact contact) {
		conrepo.save(contact);
		
	}

	@Override
	public List<Contact> findall() {
		List<Contact> contacts = conrepo.findAll();
		return contacts;
	}

	@Override
	public Contact findbyid(Long id) {
		Optional<Contact> findById = conrepo.findById(id);
		Contact contact = findById.get();
		return contact ;
		
	}

}
