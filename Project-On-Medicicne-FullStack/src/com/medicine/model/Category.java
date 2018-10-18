package com.medicine.model;

import java.io.Serializable;
import java.util.UUID;

public class Category implements Serializable
{
private String categoryId;
private String categoryName;
private String categoryDescription;

public Category()
{
	this.categoryId = UUID.randomUUID().toString().substring(0,5);	
}

public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {

}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDescription() {
	return categoryDescription;
}
public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}
 public String tostring()
 {
	 return categoryId;
 }

}
