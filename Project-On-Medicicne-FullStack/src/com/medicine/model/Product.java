package com.medicine.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.UUID;

public class Product implements Serializable
{
private String productId;
private String productName;
private String productDescription;
private double productPrice;
private double productQuantity;
private String productCategory;
private String categoryTypeId;

public Product()
{
	this.productId = UUID.randomUUID().toString().substring(0,5);
}

public String getCategoryTypeId() {
	return categoryTypeId;
}
public void setCategoryTypeId(String categoryTypeId) {
	this.categoryTypeId = UUID.randomUUID().toString().substring(0,5);
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public double getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(double productQuantity) {
	this.productQuantity = productQuantity;
}
 public String toString()
 {
	 return productId;
 }

}
