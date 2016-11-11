package com.commerceHub.imsService;

import com.commerceHub.model.PickingResult;

import com.commerceHub.model.RestockingResult;

public interface InventoryManagementSystem {

	PickingResult pickProduct(String productId, int amountToPick);

	RestockingResult restockProduct(String productId, int amountToRestock);

}
