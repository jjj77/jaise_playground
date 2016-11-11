package com.commerceHub.test;

import com.commerceHub.imsService.InventoryManagementSystem;
import com.commerceHub.imsService.InventoryManagementSystemImpl;

public class app {

	public static void main(String[] args) {
		
		InventoryManagementSystem ims = new InventoryManagementSystemImpl();
		
		ims.pickProduct("1", 3);
		
		ims.pickProduct("1", 1);
		
		ims.pickProduct("1", 3);
		
		System.out.println("------------------------------------------");
		
		ims.restockProduct("1", 15);
		
		ims.restockProduct("1", 90);
		
		ims.restockProduct("1", 3);
	
		

	}

	

}
