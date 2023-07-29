package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	//fake list of contacts
	List<Contact> list = List.of(
			
			new Contact(1L, "khushi@gmail.com", "khushi", 101L),
			new Contact(2L, "khushali@gmail.com", "khushali", 101L),
			new Contact(3L, "nisha@gmail.com", "nisha", 102L),
			new Contact(4L, "dhara@gmail.com", "dhara", 103L),
			new Contact(5L, "pooja@gmail.com", "pooja", 104L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
