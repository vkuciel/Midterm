package com.cisc181.core;

public class PersonException extends Exception {

	private Person scholar;
	private Person Person;
	public PersonException(Person scholar) {
		this.Person = scholar;
	}
	

}
