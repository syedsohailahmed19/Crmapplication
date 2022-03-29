package com.zomatocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomatocrm.entities.Bills;

@Repository
public interface BillsRepositories extends JpaRepository<Bills, Long> {

}
