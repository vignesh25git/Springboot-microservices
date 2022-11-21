package com.vicky.dto;

import com.vicky.entity.Person;

public class PersonDto {
	
	private Person person;
	
	private Integer empsal;
	
	public PersonDto() {
		super();
	}
	

	public PersonDto(Person person, Integer empsal) {
		super();
		this.person = person;
		this.empsal = empsal;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getEmpsal() {
		return empsal;
	}

	public void setEmpsal(Integer empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "PersonDto [person=" + person + ", empsal=" + empsal + "]";
	}
	
	
}
