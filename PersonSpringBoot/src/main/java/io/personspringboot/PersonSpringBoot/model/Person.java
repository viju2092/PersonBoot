package io.personspringboot.PersonSpringBoot.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private String personId;
	private String personName;
	private int personAge;
	private String personAddress;
	
	public String getPersonId() {
		return personId;
	}
	
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public int getPersonAge() {
		return personAge;
	}
	
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	public String getPersonAddress() {
		return personAddress;
	}
	
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
}
