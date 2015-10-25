package com.example.dao;

import java.util.List;

import com.example.resources.Person;

public interface PersonDAO {

	List<Person> findAll();
	Person findById(int parseInt);

}
