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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inventoryLevel;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + maxLevel;
		result = prime * result + ((productID == null) ? 0 : productID.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (inventoryLevel != other.inventoryLevel)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (maxLevel != other.maxLevel)
			return false;
		if (productID == null) {
			if (other.productID != null)
				return false;
		} else if (!productID.equals(other.productID))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}
	
	
	
	
	
	

}
