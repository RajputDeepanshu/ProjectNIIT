package com.medicine.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.medicine.dao.CategoryMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.model.Category;

public class CategoryMedicineImpl implements CategoryMedicine
{
	
   private Connection con=null;
   
	@Override
	public boolean addCategory(Category category) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("insert into category values(?,?,?)");
			statement.setString(1,category.getCategoryId());
			statement.setString(2,category.getCategoryName());
			statement.setString(3,category.getCategoryDescription());
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("Your Category is Successfully added");
				return true;
			}
		}catch(SQLException e)
		{
			   System.out.println("Something went wrong try again");
		       System.out.println(e);	
		}
		System.out.println("Something went wrong try again");
			return false;	
		
		
	}

	@Override
	public boolean updateCategory(Category category) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("update category set categoryName=? , categoryDescription=? where categoryId=?");
			statement.setString(1,category.getCategoryName());
			statement.setString(2,category.getCategoryDescription());
			statement.setString(3,category.getCategoryId());
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("Category is Successfully updated.");
				return true;
			}
		}catch(SQLException ee)
		{
		  System.out.println(ee);
		}
		
			return false;	
		
		
	}

	@Override
	public boolean deleteCategory(Category category) {
		try
		{
			PreparedStatement statement=con.prepareStatement("delete from category where categoryId=?");
			statement.setString(1,category.getCategoryId());
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("your Category is successfully deleted");
				return true;
			}
			
		}catch(SQLException es)
		{
			System.out.println("Sorry Category could not be deleted.");
			System.out.println(es);
		}
			return false;		
		
	
	}

	@Override
	public List<Category> getAllCategory() {
		try
		{
		con=ConnectionProvider.getConnection();
		List<Category> list=new ArrayList<Category>();
		Statement statement=con.createStatement();
		ResultSet result=statement.executeQuery("select * from category");
		
		System.out.println("*#----------Category You have---------#*");
	    while(result.next())
	  {
	System.out.println("CategoryId:-" +result.getString(1)+ "\nCategoryName:-" +result.getString(2)+ "\nCategoryDescription:-" +result.getString(3));
	Category category=new Category();
	category.setCategoryId(result.getString(1));
	category.setCategoryName(result.getString(2));
	category.setCategoryDescription(result.getString(3));
	list.add(category);
	}
	    return list;
		
		}catch(SQLException se)
		{
		   
			System.out.println(se);
		}
		return null;
	}	
}
