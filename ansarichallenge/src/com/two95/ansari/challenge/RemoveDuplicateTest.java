package com.two95.ansari.challenge;

import java.util.List;



public class RemoveDuplicateTest {

	public static void main(String[] args) {
		List<Employee> emp = DataSource.getData();
		RemoveDulicateService service = new RemoveDulicateService();
		List<Employee> uniqueList = service.removeDuplicates(emp);
		
		for(Employee e : emp){
			System.out.println(e);
		}
		System.out.println("\n...............unique..........\n");
		for(Employee e : uniqueList){
			System.out.println(e);
		}


	}

}
