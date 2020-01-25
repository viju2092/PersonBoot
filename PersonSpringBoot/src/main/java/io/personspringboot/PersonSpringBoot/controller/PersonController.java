package io.personspringboot.PersonSpringBoot.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.personspringboot.PersonSpringBoot.model.Person;
import io.personspringboot.PersonSpringBoot.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService personService;
	
	@RequestMapping("/persondata")
	public Hashtable<String, Person> getAllPersons() {
		return personService.getAllPersons();
	}
	
	@RequestMapping("/persondata/{id}")
	public Person getPersonId(@PathVariable("id") String id) {
		return personService.getPersonId(id);
	}
}
