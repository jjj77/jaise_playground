package com.jaise.challenge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {
	
	private List<Employee> employees = new ArrayList<>();
	
	
	public Department() {
		super();
		
	}

	@Override
	public void add(Employee employee) {
		this.employees.add(employee);
		

	}

	@Override
	public void remove(Employee employee) {
		this.employees.add(employee);
		

	}

	@Override
	public BigDecimal getAllocation() {
		BigDecimal totalAllocation = new BigDecimal("0");
		for(Employee e:employees){
			totalAllocation = totalAllocation.add(e.getAllocation());
		}
		
		return totalAllocation;
	}

}
