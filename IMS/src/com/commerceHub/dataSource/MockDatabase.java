package com.commerceHub.dataSource;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.commerceHub.model.Product;

public class MockDatabase {
	private static volatile ConcurrentMap<String,Product> productList = new ConcurrentHashMap<>();
	static Product p1 = new Product("1","productA",5,100,"locationA");
	static Product p2 = new Product("2","productB",5,100,"locationB");
	static Product p3 = new Product("3","productC",5,100,"locationC");
	static Product p4 = new Product("4","productD",5,100,"locationD");
	static Product p5 = new Product("5","productE",5,100,"locationE");
	public static ConcurrentMap<String,Product> getList()  {
		setList();
		return productList;
	}
	private static void setList()  {
		
		productList.put(p1.getProductID(), p1);
		productList.put(p2.getProductID(), p2);
		productList.put(p3.getProductID(), p3);
		productList.put(p4.getProductID(), p4);
		productList.put(p5.getProductID(), p5);
		
	}

}
