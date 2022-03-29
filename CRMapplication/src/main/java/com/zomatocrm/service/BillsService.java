package com.zomatocrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Bills;

@Service
public interface BillsService {

	void save(Bills bill);

	List<Bills> findallbills();

}
