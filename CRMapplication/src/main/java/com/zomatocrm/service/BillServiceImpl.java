package com.zomatocrm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Bills;
import com.zomatocrm.repositories.BillsRepositories;

@Service
public class BillServiceImpl implements BillsService {

	@Autowired
	private BillsRepositories billrepo;
	
	
	@Override
	public void save(Bills bill) {
		billrepo.save(bill);
	}


	@Override
	public List<Bills> findallbills() {
		List<Bills> findAll = billrepo.findAll();
		return findAll;
	}

}
