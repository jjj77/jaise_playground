package com.two95.codechallenge1;

import java.text.MessageFormat;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author jjais
 *
 *This is the application class with the main method
 */

public class EmplAgeTest {

	private static String message = "Employee {0} bearing ID {1} is {2} years old";
	
	public static void main(String[] args) {
		String c;
		Scanner sc = new Scanner(System.in);
		
		// initializing the list with entries from the data source
		List<Employee> emp = DataSource.getData();
		
		// initializing the service class
		AgeSortReturnListService service = new AgeSortReturnListService();
		
		//passing the data into service class method. This will return an array with 3 objects
		List<Employee>[] employees = service.sortedByAgeArrayObjs(emp);
		
		do {
			System.out.println("To retrieve data of employees with age < 30 please press 1");
			System.out.println("To retrieve data of employees with age between 30 and 40 please press 2");
			System.out.println("To retrieve data of employees with age > 40 please press 3");

			int i = sc.nextInt();
		
			try {
				for (Employee e : employees[i - 1]) {
					System.out.println(MessageFormat.format(message, e.getName(), e.getId(), e.getAge()));
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid choice");
			}
			
			System.out.println("Do you want to continue: [y/n]");
			c = sc.next();
		} while (c.equals("y"));

		sc.close();

	}

}
