package com.commerceHub.imsService;

import java.util.concurrent.ConcurrentMap;

import com.commerceHub.model.Product;

public interface InventoryManagementSystem {
	
	 public ConcurrentMap<String,Product> pickProduct(String productId, int amountToPick);
	 
	 public ConcurrentMap<String,Product> restockProduct(String productId, int amountToRestock);

}
