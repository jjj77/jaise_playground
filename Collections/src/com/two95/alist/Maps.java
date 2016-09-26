package com.two95.alist;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.TreeMap;

import com.two95.model.Employee;

public class Maps {
	public static void main(String[] args){
	Map<Integer, Employee> employeelist = new HashMap<>();
	Map<Integer, Employee> employeelist1 = new LinkedHashMap<>();
	Map<Integer, Employee> employeelist2 = new TreeMap<>();
	
	displaylist(employeelist);
	System.out.println("...........------------............");
	displaylist(employeelist1);
	System.out.println("...........------------............");
	displaylist(employeelist2);
	}
	public static void displaylist(Map<Integer, Employee> emplist){
		Employee e1 = new Employee(1,"samuel",30,"6000");
		Employee e2 = new Employee(2,"Jackson",35,"7000");
		Employee e3 = new Employee(3,"DQ",29,"5500");
		Employee e4 = new Employee(4,"Mammuss",60,"9000");
		
		
		emplist.put(e3.getE_id(), e3);
		emplist.put(e1.getE_id(), e1);
		emplist.put(e4.getE_id(), e4);
		emplist.put(e2.getE_id(), e2);
		for(Integer key:emplist.keySet()){
			System.out.println(key+" : "+emplist.get(key));
			
		}
		
	}

}
