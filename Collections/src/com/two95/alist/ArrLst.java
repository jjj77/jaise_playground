package com.two95.alist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.two95.model.Employee;

public class ArrLst {
	public static void main(String[] args){
	Employee e1 = new Employee(1,"samuel",30,"6000");
	Employee e2 = new Employee(2,"Jackson",35,"7000");
	Employee e3 = new Employee(3,"DQ",29,"5500");
	Employee e4 = new Employee(4,"Mammuss",60,"9000");
	List<Employee> emplist = new ArrayList<>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);
	emplist.add(e4);
	for(Employee e:emplist){
		System.out.println(e);
	}
	emplist.remove(1);
	System.out.println("...........------------............");
	for(Employee e:emplist){
		System.out.println(e);
	}
	
	Iterator<Employee> iterate = emplist.iterator();
	System.out.println("...........------------............");
	while(iterate.hasNext()){
		System.out.println(iterate.next());
	
	}
	}
}
