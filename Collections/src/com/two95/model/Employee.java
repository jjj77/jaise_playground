package com.two95.model;

public class Employee {
	private int e_id;
	private String name;
	private int age;
	private String salary;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(int e_id, String name, int age, String salary) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee e_id=" + e_id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	}
	
	

}
