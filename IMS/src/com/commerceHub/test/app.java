package com.commerceHub.test;

import java.util.concurrent.ConcurrentMap;

import com.commerceHub.dataSource.MockDatabase;
import com.commerceHub.imsService.InventoryManagementSystem;
import com.commerceHub.imsService.InventoryManagementSystemImpl;
import com.commerceHub.model.Product;

public class app {

	public static void main(String[] args) {
		
		InventoryManagementSystem ims = new InventoryManagementSystemImpl();
		
		ims.pickProduct("1", 3);
		int level = getInventory("1");
		System.out.println("level = "+level);
		ims.pickProduct("1", 1);
		int level2 = getInventory("1");
		System.out.println("level = "+level2);
		ims.pickProduct("1", 3);
		int level3 = getInventory("1");
		System.out.println("level = "+level3);
		System.out.println("------------------------------------------");
		
		ims.restockProduct("1", 15);
		int leve4 = getInventory("1");
		System.out.println("level = "+leve4);
		ims.restockProduct("1", 90);
		int level5 = getInventory("1");
		System.out.println("level = "+level5);
		ims.restockProduct("1", 3);
		int level6 = getInventory("1");
		System.out.println("level = "+level6);
		

	}

	private static int getInventory(String iD) {
		ConcurrentMap<String, Product> productList = MockDatabase.getList();
		Product p = productList.get(iD);
		int temp = p.getInventoryLevel();
		
		
		return temp;
		// TODO Auto-generated method stub
		
	}

}
