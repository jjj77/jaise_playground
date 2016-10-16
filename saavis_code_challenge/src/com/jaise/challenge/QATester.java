package com.jaise.challenge;

import java.math.BigDecimal;

public class QATester implements Employee{
	
	private static final BigDecimal allocation = new BigDecimal("500");
	
	public QATester() {
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
		
		return QATester.allocation;
	}

}
