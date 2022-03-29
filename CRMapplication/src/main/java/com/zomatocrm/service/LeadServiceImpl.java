package com.zomatocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.repositories.Leadrepositories;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	Leadrepositories leadrepo;
	
	
	@Override
	public void savelead(Lead lead) {
		leadrepo.save(lead);

	}


	@Override
	public List<Lead> findleads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}


	@Override
	public Lead findleadbyid(Long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}


	@Override
	public void deletebyid(Long id) {
		leadrepo.deleteById(id);
	}


	@Override
	public Lead findrecord(Long id) {

		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}







}
