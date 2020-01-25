package io.personspringboot.PersonSpringBoot.service;

import java.util.*;
import org.springframework.stereotype.Service;
import io.personspringboot.PersonSpringBoot.model.Person;

@Service
public class PersonService {

	Hashtable<String,Person> personhash = new Hashtable<String,Person>();
	
	public PersonService() {
		
		Person p = new Person();
		p.setPersonId("PER-100");
		p.setPersonName("Gaurav");
		p.setPersonAge(43);
		p.setPersonAddress("Dallas TX");
		personhash.put("PER-100", p);
		
		
		p = new Person();
		p.setPersonId("PER-101");
		p.setPersonName("Mohit");
		p.setPersonAge(32);
		p.setPersonAddress("Ann Arbor MI");
		personhash.put("PER-101", p);
		
		
		p = new Person();
		p.setPersonId("PER-102");
		p.setPersonName("Rahul");
		p.setPersonAge(25);
		p.setPersonAddress("San Jose CA");	
		personhash.put("PER-102", p);
		
		p = new Person();
		p.setPersonId("PER-103");
		p.setPersonName("Arjun");
		p.setPersonAge(27);
		p.setPersonAddress("Shoreview MO");	
		personhash.put("PER-103", p);
		
		p = new Person();
		p.setPersonId("PER-104");
		p.setPersonName("Vignesh");
		p.setPersonAge(30);
		p.setPersonAddress("Philadelphia PN");	
		personhash.put("PER-104", p);
	}
	
	public Person getPersonId(String id) {
		if(personhash.containsKey(id))
			return personhash.get(id);
		else
			return null;
	}
	
	public Hashtable<String, Person> getAllPersons() {
		return personhash;
	}
	
}
