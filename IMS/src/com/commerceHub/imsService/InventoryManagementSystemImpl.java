package com.commerceHub.imsService;

import java.util.concurrent.ConcurrentMap;

import com.commerceHub.dataSource.MockDatabase;
import com.commerceHub.model.Product;

public class InventoryManagementSystemImpl implements InventoryManagementSystem {
	ConcurrentMap<String, Product> productList = MockDatabase.getList();

	@Override
	public synchronized ConcurrentMap<String, Product> pickProduct(String productId, int amountToPick) {
		try {
			Product productX = (Product) productList.get(productId);
			if (productX != null) {
				if (amountToPick > productX.getInventoryLevel()) {
					System.out.println("Not enough products");
				} else {
					int temp = productX.getInventoryLevel() - amountToPick;
					productX.setInventoryLevel(temp);
					productList.replace(productId, productX);
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
					System.out.println("Over the limit. Only "+(productX.getMaxLevel()-productX.getInventoryLevel())+" units can be added");
				} else {
					int temp = productX.getInventoryLevel() + amountToRestock;
					productX.setInventoryLevel(temp);
					productList.replace(productId, productX);
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
