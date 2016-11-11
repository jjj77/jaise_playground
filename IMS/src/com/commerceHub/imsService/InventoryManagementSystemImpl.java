package com.commerceHub.imsService;

import java.util.concurrent.ConcurrentMap;

import com.commerceHub.dataSource.MockDatabase;
import com.commerceHub.model.Product;

public class InventoryManagementSystemImpl implements InventoryManagementSystem {
	
	private String messageForPicking = "{0} units of Product {1} bearing ID {2} picked";
	private String messageForRestocking = "{0} units of Product {1} bearing ID {2} added";
	ConcurrentMap<String, Product> productList = MockDatabase.getList();

	@Override
	public synchronized ConcurrentMap<String, Product> pickProduct(String productId, int amountToPick) {
		try {
			Product productX = (Product) productList.get(productId);
			if (productX != null) {
				if (amountToPick > productX.getInventoryLevel()) {
					System.out.println("Not sufficient units of product "+productX.getProductID()+" in the inventory");
				} else {
					int temp = productX.getInventoryLevel() - amountToPick;
					productX.setInventoryLevel(temp);
					productList.replace(productId, productX);
					System.out.println(amountToPick+" units of product "+productX.getProductID()+" removed from the inventory. Inventory level = "+productX.getInventoryLevel());
				}
			} else {
				System.out.println("the product id is invalid");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return productList;
	}

	@Override
	public ConcurrentMap<String, Product> restockProduct(String productId, int amountToRestock) {
		try {
			Product productX = (Product) productList.get(productId);
			if (productX != null) {
				if ((amountToRestock + productX.getInventoryLevel()) > productX.getMaxLevel()) {
					System.out.println("Over the limit. Only " + (productX.getMaxLevel() - productX.getInventoryLevel())
							+ " units of "+productX.getProductID()+" can be added more");
				} else {
					int temp = productX.getInventoryLevel() + amountToRestock;
					productX.setInventoryLevel(temp);
					productList.replace(productId, productX);
					System.out.println(amountToRestock+" units of product "+productX.getProductID()+" added to the inventory. Inventory level = "+productX.getInventoryLevel());
				}
			} else {
				System.out.println("the product id is invalid");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return productList;

	}

}
