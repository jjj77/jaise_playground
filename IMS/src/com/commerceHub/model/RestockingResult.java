package com.commerceHub.model;

public class RestockingResult {

	private String productId;
	private String productLocation;
	private int inventoryCurrentLevel;
	private int excessRequest;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductLocation() {
		return productLocation;
	}
	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}
	public int getInventoryCurrentLevel() {
		return inventoryCurrentLevel;
	}
	public void setInventoryCurrentLevel(int inventoryCurrentLevel) {
		this.inventoryCurrentLevel = inventoryCurrentLevel;
	}
	public int getExcessRequest() {
		return excessRequest;
	}
	public void setExcessRequest(int excessRequest) {
		this.excessRequest = excessRequest;
	}
	
}
