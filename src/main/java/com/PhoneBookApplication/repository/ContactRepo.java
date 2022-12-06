package com.PhoneBookApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PhoneBookApplication.entity.Contact;

public interface  ContactRepo extends JpaRepository<Contact, Integer>{

}
