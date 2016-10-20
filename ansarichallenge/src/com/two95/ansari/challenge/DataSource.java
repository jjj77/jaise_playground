package com.two95.ansari.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DataSource {
	
	
	public static List<Employee> emplist = new ArrayList<>();

	public static List<Employee> getData() {

		emplist.add(new Employee(1, "A", 25));
		emplist.add(new Employee(2, "B", 24));
		emplist.add(new Employee(1, "A", 25));
		emplist.add(new Employee(1, "A", 25));
		emplist.add(new Employee(5, "E", 47));
		emplist.add(new Employee(6, "F", 45));
		emplist.add(new Employee(1, "A", 25));

		
		return emplist;
	}

}
