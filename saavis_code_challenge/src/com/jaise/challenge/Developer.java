package com.jaise.challenge;

import java.math.BigDecimal;

public class Developer implements Employee {
	private static final BigDecimal allocation = new BigDecimal("1000");
	
	
	public Developer() {
		super();
		
	}

	@Override
	public void add(Employee employee) {
		
		
	}

	@Override
	public void remove(Employee employee) {
	
		
	}

	@Override
	public BigDecimal getAllocation() {
		
		return Developer.allocation;
	}
	

}
