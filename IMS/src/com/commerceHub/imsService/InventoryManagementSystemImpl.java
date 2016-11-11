package com.commerceHub.imsService;

import java.util.concurrent.ConcurrentMap;

import com.commerceHub.dataSource.MockDatabase;
import com.commerceHub.model.PickingResult;
import com.commerceHub.model.Product;
import com.commerceHub.model.RestockingResult;

public class InventoryManagementSystemImpl implements InventoryManagementSystem {

	ConcurrentMap<String, Product> productList = MockDatabase.getList();

	@Override
	public synchronized PickingResult pickProduct(String productId, int amountToPick) {
		PickingResult pickingResult = new PickingResult();
		try {
			Product productX = (Product) productList.get(productId);

			if (productX != null) {
				if (amountToPick >= productX.getInventoryLevel()) {

					pickingResult.setProductId(productX.getProductID());
					pickingResult.setProductLocation(productX.getLocation());
					pickingResult.setInventoryCurrentLevel(0);
					pickingResult.setExcessRequest(amountToPick - productX.getInventoryLevel());
					productX.setInventoryLevel(0);
					productList.replace(productId, productX);

				} else {

					int temp = productX.getInventoryLevel() - amountToPick;

					pickingResult.setProductId(productX.getProductID());
					pickingResult.setProductLocation(productX.getLocation());
					pickingResult.setInventoryCurrentLevel(temp);
					pickingResult.setExcessRequest(0);

					productX.setInventoryLevel(temp);
					productList.replace(productId, productX);

				}
			} else {
				System.out.println("the product id is invalid");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return pickingResult;
	}

	@Override
	public synchronized RestockingResult restockProduct(String productId, int amountToRestock) {
		RestockingResult restockingResult = new RestockingResult();
		try {
			Product productX = (Product) productList.get(productId);
			if (productX != null) {
				if ((amountToRestock + productX.getInventoryLevel()) > productX.getMaxLevel()) {

					restockingResult.setProductId(productX.getProductID());
					restockingResult.setProductLocation(productX.getLocation());
					restockingResult.setInventoryCurrentLevel(productX.getMaxLevel());
					restockingResult.setExcessRequest(
							(amountToRestock + productX.getInventoryLevel()) - productX.getMaxLevel());
					productX.setInventoryLevel(productX.getMaxLevel());
					productList.replace(productId, productX);

				} else {
					int temp = productX.getInventoryLevel() + amountToRestock;

					restockingResult.setProductId(productX.getProductID());
					restockingResult.setProductLocation(productX.getLocation());
					restockingResult.setInventoryCurrentLevel(temp);
					restockingResult.setExcessRequest(0);
					productX.setInventoryLevel(temp);
					productList.replace(productId, productX);

				}
			} else {
				System.out.println("the product id is invalid");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return restockingResult;

	}

}
