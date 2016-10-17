package com.jaise.challenge.JunitTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.jaise.challenge.AllocationService;
import com.jaise.challenge.Department;
import com.jaise.challenge.Developer;
import com.jaise.challenge.Employee;
import com.jaise.challenge.Manager;
import com.jaise.challenge.QATester;

public class AllocationServiceTest {
	public AllocationService service;

	@Test //to check whether the constructor is creating the object
	public void testAllocationService() {
		service = new AllocationService(null);
		assertNotNull(service);
		
		
	}

	@Test
	public void testGetAllocation_when_ManagerDoesNotHaveAnyOtherEmployee() {
		Employee itManager = new Manager();
		BigDecimal expectedOp = new BigDecimal("300");
		service = new AllocationService(itManager);
		Assert.assertEquals(expectedOp, service.getAllocation());
	}
	
	@Test
	public void testGetAllocation_when_ManagerHasTwoDevelopersAndOneTester() {
		Employee itManager = new Manager();
		itManager.add(new Developer());
		itManager.add(new Developer());
		itManager.add(new QATester());
		BigDecimal expectedOp = new BigDecimal("2800");
		service = new AllocationService(itManager);
		Assert.assertEquals(expectedOp, service.getAllocation());
	}
	
	@Test
	public void getAllocation_when_GeneralManagerHasTwoTestersTwoDevelopersOneITManagerWithOneTesterAndOneDeveloper() {
		BigDecimal expectedOp = new BigDecimal("5100");
		
		Employee generalManager = new Manager();
				
			Manager itManager = new Manager();
			itManager.add(new QATester());
			itManager.add(new Developer());

		generalManager.add(new QATester());
		generalManager.add(new QATester());
		generalManager.add(new Developer());
		generalManager.add(new Developer());
		generalManager.add(itManager);

		service = new AllocationService(generalManager);
		Assert.assertNotNull(service);
		Assert.assertEquals(expectedOp, service.getAllocation());
	}
	@Test
	public void getAllocation_when_DepartmentHasNoEmployees(){
		BigDecimal expectedOp = new BigDecimal("0");
		Employee itDepartment = new Department();
		service = new AllocationService(itDepartment);
		Assert.assertEquals(expectedOp, service.getAllocation());
	}
	@Test
	public void getAllocation_when_DepartmentHas_OneGeneralManagerWithTwoTestersTwoDevelopersOneITManagerWithOneTesterAndOneDeveloper() {
		BigDecimal expectedOp = new BigDecimal("5100");
		Department itDepartment = new Department();	
	
		Employee generalManager = new Manager();
			
			Manager itManager = new Manager();
			itManager.add(new QATester());
			itManager.add(new Developer());

		generalManager.add(new QATester());
		generalManager.add(new QATester());
		generalManager.add(new Developer());
		generalManager.add(new Developer());
		generalManager.add(itManager);
		
	itDepartment.add(generalManager);
		
	service = new AllocationService(itDepartment);
	Assert.assertNotNull(service);
	Assert.assertEquals(expectedOp, service.getAllocation());
}

	}

