package com.two95.ansari.challenge;

import java.util.ArrayList;
import java.util.List;

public class RemoveDulicateService {
	List<Employee> emplst = new ArrayList<>();
	List<Employee> emplstUnique = new ArrayList<>();
	
	
	
	public List<Employee> removeDuplicates(List<Employee> emplst){
		
		for (Employee element : emplst) {
	          if (!emplstUnique.contains(element)) {
	        	  emplstUnique.add(element);
	          }
	    }
		
		
		return emplstUnique;
	}

}
