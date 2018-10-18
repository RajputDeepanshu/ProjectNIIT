package com.medicine.dao;

import java.util.List;

import com.medicine.model.Product;

public interface ProductMedicine 
{
boolean addProduct(Product product);
boolean updateProduct(Product product);
boolean deleteProduct(Product product);
List<Product> getProduct();
Product getAllProductByProductId(String productId);
Product getAllProductByProductCategory(String productCategory);
}
