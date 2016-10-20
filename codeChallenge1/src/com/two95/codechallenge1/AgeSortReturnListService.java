package com.two95.codechallenge1;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author jjais
 *
 * This service class returns an array with list objects.
 * The first object contains a list of employees with age less than 30.
 * The second object contains a list of employees with age between 30 and 40 both inclusive. 
 * The third object contains a list of employees with age grater than 40.
 * 
 */


public class AgeSortReturnListService {

	List<Employee> emp = new ArrayList<>();
	List<Employee> empunder30 = new ArrayList<>();
	List<Employee> empbetween30and40 = new ArrayList<>();
	List<Employee> empabove40 = new ArrayList<>();

	public List<Employee>[] sortedByAgeArrayObjs(List<Employee> emp) {
		this.emp = emp;
		for (Employee e : emp) {
			if (e.getAge() < 30) {
				empunder30.add(e);
			} else if (e.getAge() <= 40) {
				empbetween30and40.add(e);
			} else {
				empabove40.add(e);
			}
		}
		@SuppressWarnings("unchecked")
		List<Employee>[] emparray = new List[3];
		emparray[0] = empunder30;
		emparray[1] = empbetween30and40;
		emparray[2] = empabove40;

		return emparray;
}
	}
