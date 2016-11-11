package com.commerceHub.model;


/**
 * @author Jaise
 *
 */
public class Product {
	private String productID;
	private String productName;
	private int inventoryLevel;
	private int maxLevel;
	private String location;
	
	public Product() {
		super();
	}
	public Product(String productID, String productName, int inventoryLevel, int maxLevel, String location) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.inventoryLevel = inventoryLevel;
		this.maxLevel = maxLevel;
		this.location = location;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getInventoryLevel() {
		return inventoryLevel;
	}
	public void setInventoryLevel(int inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	@Override
	public String toString() {
		return "Product with productID=" + productID + ", productName=" + productName + ", inventoryLevel=" + inventoryLevel
				+ ", is at location=" + location;
	}
	
	
	
	

}
