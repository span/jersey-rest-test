package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.resources.Person;

public class PersonDAOMock implements PersonDAO {

	public List<Person> findAll() {
		List<Person> list = new ArrayList<Person>();
		for(int i = 0; i < 10; i++) {
			list.add(createEmployee(i, "John", "Doe"));
		}
		return list;
	}

	public Person findById(int id) {
		return createEmployee(id, "John", "Doe");
	}
	
	private Person createEmployee(int id, String firstName, String lastName) {
		Person employee = new Person.Builder()
				.id(id)
				.firstName(firstName)
				.lastName(lastName)
				.build();
		return employee;
	}

}
