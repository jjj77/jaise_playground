package com.jaise.challenge;

import java.math.BigDecimal;

public class AllocationService {

	private Employee employee;

	public AllocationService(Employee employee) {
		super();
		this.employee = employee;
	}
	public BigDecimal getAllocation(){
		return employee.getAllocation();
	}

}
