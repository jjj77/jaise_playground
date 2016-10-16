package com.jaise.challenge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
	private static final BigDecimal allocation = new BigDecimal("300");
	private List<Employee> employees = new ArrayList<>();
	

	public Manager() {
		super();
		
	}

	@Override
	public void add(Employee employee) {
		this.employees.add(employee);

	}

	@Override
	public void remove(Employee employee) {
		
		this.employees.remove(employee);
	}

	@Override
	public BigDecimal getAllocation() {
		BigDecimal totalAllocation = Manager.allocation;
		for(Employee e:employees){
			totalAllocation = totalAllocation.add(e.getAllocation());
		}
		
		return totalAllocation;
	}

}
