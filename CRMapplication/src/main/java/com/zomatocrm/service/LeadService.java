package com.zomatocrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Lead;

@Service
public interface LeadService {
	
	
public void savelead(Lead lead);

public List<Lead> findleads();

public Lead findleadbyid(Long id);

public void deletebyid(Long id);

public Lead findrecord(Long id);




}
