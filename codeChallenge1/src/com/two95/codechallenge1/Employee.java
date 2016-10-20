package com.two95.codechallenge1;

import java.text.MessageFormat;


/**
 * 
 * @author jjais
 *
 *This is the model class.
 *The data created will be stored in sorted on age format
 */

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private String message = "Employee {0} bearing ID {1} is {2} years old";
	MessageFormat mf = new MessageFormat(message);
	public Employee() {
		super();
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee : id=" + id + ", name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(Employee o) {
		if (age == o.age)

			return 0;
		else if (age < o.age)
			return -1;
		else
			return 1;

	}

}

