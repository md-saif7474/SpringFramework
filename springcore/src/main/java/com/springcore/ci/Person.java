package com.springcore.ci;

public class Person {
	private String name;
	private String personId;
	
	public Person(String name, String personId)
	{
		this.name = name;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId ;
	}
	
	
}
