package com.two95.codechallenge1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *This class mocks the function of a database.
 *The records are all hard coded. 
 */

public class DataSource {
	public static List<Employee> emplist = new ArrayList<>();

	public static List<Employee> getData() {

		emplist.add(new Employee(1, "A", 25));
		emplist.add(new Employee(2, "B", 24));
		emplist.add(new Employee(3, "C", 30));
		emplist.add(new Employee(4, "D", 35));
		emplist.add(new Employee(5, "E", 47));
		emplist.add(new Employee(6, "F", 45));
		emplist.add(new Employee(7, "G", 46));

		Collections.sort(emplist);
		return emplist;
	}

}
