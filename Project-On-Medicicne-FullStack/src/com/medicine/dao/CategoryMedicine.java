package com.medicine.dao;

import java.util.List;

import com.medicine.model.Category;

public interface CategoryMedicine
{
boolean addCategory(Category category);
boolean updateCategory(Category category);
boolean deleteCategory(Category category);
List<Category> getAllCategory();
}
