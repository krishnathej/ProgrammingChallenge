package com.hcl.program.impl;

import java.util.HashMap;


import com.hcl.program.model.Address;
import com.hcl.program.model.Person;

public class databaseimpl {

	public static HashMap<Integer, Person> Database = new HashMap<>();

	public Person Return_Database(int ID) {
		//Inserting records
		Address address1 = new Address("123 ", "Fitch PATH Road", "kansas", "Missouri", "48855");
		Address address2 = new Address("184 ", "CowBoys Parkway", "Plano", "Texas", "45695");

		Person person1 = new Person(101, "SAM", "45235892", address1);
		Person person2 = new Person(1001, "Jerry", "45225192", address2);

		Database.put(person1.ID, person1);
		Database.put(person2.ID, person2);
		
		//Retrieving data
		Person person = Database.get(ID);

		//returning object
		return person;
	}

}
