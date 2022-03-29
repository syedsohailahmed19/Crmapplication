package com.zomatocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zomatocrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
