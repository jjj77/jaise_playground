package com.jaise.challengeTest;

import java.math.BigDecimal;
import java.text.MessageFormat;

import com.jaise.challenge.AllocationService;
import com.jaise.challenge.Department;
import com.jaise.challenge.Developer;
import com.jaise.challenge.Employee;
import com.jaise.challenge.Manager;
import com.jaise.challenge.QATester;

public class TestAllocation {

	public static void main(String[] args) {
		final String messageFormat = "{0} has a total budget allocation of ${1}";
		Employee generalManager = new Manager();
		Employee javaDepartment = new Department();
		
	
		generalManager.add(new QATester());
		generalManager.add(new QATester());
		generalManager.add(new Developer());
		generalManager.add(new Developer());
		
		Manager itManager = new Manager();
		itManager.add(new QATester());
		itManager.add(new Developer());
		generalManager.add(itManager);
		
		Manager softwareManager = new Manager();
		softwareManager.add(new QATester());
		softwareManager.add(new Developer());
		generalManager.add(softwareManager);
		
		AllocationService service = new AllocationService(generalManager);
		//System.out.println(service.getAllocation());
		System.out.println(MessageFormat.format(messageFormat, "GeneralManager",
				service.getAllocation() ));
		
		javaDepartment.add(generalManager);
		javaDepartment.add(new Manager());
		AllocationService service1 = new AllocationService(javaDepartment);
		System.out.println(MessageFormat.format(messageFormat, "Java Department",
				service1.getAllocation() ));
		
		
		
		

	}

}
