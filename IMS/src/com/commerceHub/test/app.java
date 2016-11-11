package com.commerceHub.test;

import com.commerceHub.imsService.InventoryManagementSystem;
import com.commerceHub.imsService.InventoryManagementSystemImpl;
import com.commerceHub.model.PickingResult;
import com.commerceHub.model.RestockingResult;

public class app {

	public static void main(String[] args) {
		
		InventoryManagementSystem ims = new InventoryManagementSystemImpl();
		PickingResult pR = new PickingResult();
		RestockingResult rR = new RestockingResult();
		
		pR = ims.pickProduct("1", 3);
		
		System.out.println("productlocation : "+pR.getProductLocation()+" \tInventory Level: "+pR.getInventoryCurrentLevel()+
				"\tExcess Request of units "+pR.getExcessRequest());
		
		pR = ims.pickProduct("1", 1);
		
		System.out.println("productlocation : "+pR.getProductLocation()+" \tInventory Level: "+pR.getInventoryCurrentLevel()+
				"\tExcess Request of units "+pR.getExcessRequest());
		
		pR = ims.pickProduct("1", 3);
		
		System.out.println("productlocation : "+pR.getProductLocation()+" \tInventory Level: "+pR.getInventoryCurrentLevel()+
				"\tExcess Request of units "+pR.getExcessRequest());
		
		System.out.println("------------------------------------------");
		
		rR = ims.restockProduct("1", 15);
		
		System.out.println("productlocation : "+rR.getProductLocation()+" \tInventory Level: "+rR.getInventoryCurrentLevel()+
				"\tExcess Request of units "+rR.getExcessRequest());
		
		
		rR = ims.restockProduct("1", 90);
		
		System.out.println("productlocation : "+rR.getProductLocation()+" \tInventory Level: "+rR.getInventoryCurrentLevel()+
				"\tExcess Request of units "+rR.getExcessRequest());		
		
		rR = ims.restockProduct("1", 3);
		
		System.out.println("productlocation : "+rR.getProductLocation()+" \tInventory Level: "+rR.getInventoryCurrentLevel()+
				"\tExcess Request of units "+rR.getExcessRequest());
		
	
		

	}

	

}
