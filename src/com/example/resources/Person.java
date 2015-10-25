package com.example.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private int id;
	private String firstName;
	private String lastName;

	public static class Builder {
		private int id;
		private String firstName;
		private String lastName;

		public Builder() {

		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	public Person(){};
	
	private Person(Builder builder) {
		id = builder.id;
		firstName = builder.firstName;
		lastName = builder.lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
