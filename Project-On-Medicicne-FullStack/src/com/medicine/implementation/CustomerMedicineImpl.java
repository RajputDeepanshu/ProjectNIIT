package com.medicine.implementation;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.medicine.dao.CustomerMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.model.Customer;

public class CustomerMedicineImpl implements CustomerMedicine
{
     private Connection con=null;
     
	@Override
	public boolean addCustomer(Customer customer) {
	    try
	    {
	      System.out.println(customer);
	      con=ConnectionProvider.getConnection();
	      System.out.println("connection ");
	      PreparedStatement statement=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?)");
	      statement.setString(1,customer.getCustomerId());
	      statement.setString(2,customer.getCustomerName());
	      statement.setString(3,customer.getCustomerPassword());
	      statement.setString(4,customer.getCustomerEmail());
	      statement.setLong(5,customer.getCustomerContact());
	      statement.setString(6,customer.getCustomerGender());
	      statement.setString(7,customer.getSecurityQuestion());
	      statement.setString(8,customer.getSecurityAnswer());
	      statement.setString(9,customer.getRole());
	     
	      int result=statement.executeUpdate();
	      
	      if(result>0)
	    	  {
	    	   System.out.println(customer.getCustomerName()+"Successfully inserted.");
	    	   return true;
	    	  }
	      
	    }catch(SQLException e)
	    {
	         	System.out.println("exception from ");
	    	
	    }
	    return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("update customer set customerName=? , customerEmail=? , customerPassword=? , customerContact=? , customerGender=? , securityQuestion=? , securityAnswer=? where CustomerId=?");
			statement.setString(1,customer.getCustomerName());
			statement.setString(2,customer.getCustomerEmail());
			statement.setString(3,customer.getCustomerPassword());
			statement.setLong(4,customer.getCustomerContact());
			statement.setString(5,customer.getCustomerGender());
			statement.setString(6,customer.getCustomerId());
			statement.setString(7,customer.getSecurityQuestion());
		    statement.setString(8,customer.getSecurityAnswer());
		    
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println(customer.getCustomerName()+"your detail is successfully updated");
				return true;
			}
		}catch(SQLException ex)
		{
				System.out.println("Customer detail could not be updated");
				System.out.println(ex);
		}
		System.out.println("Customer detail could not be updated");
		return false;
		
	}

	@Override
	public boolean deleteCustomer(Customer customer) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("delete from customer where customerId=?");
			statement.setString(1,customer.getCustomerId());
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println(customer.getCustomerName()+"Your data is successfully deleted.");
				return true;
			}
		}catch(SQLException ee)
		{
			System.out.println("Could not be deleted");
			System.out.println(ee);
		}
		System.out.println("could not be deleted");
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
		try
		{
			
			List <Customer> list=new ArrayList<Customer>();
			con=ConnectionProvider.getConnection();
			Statement statement=con.createStatement();
		    ResultSet result=statement.executeQuery("select * from customer");
		    System.out.println("#-------Customer Details-------#");
		    while(result.next())
		    {
		    	System.out.println("Id:-" +result.getString(1)+ "\nName:-" +result.getString(2)+ "\nPassword:-" +result.getString(3)+ "\nEmail:-" +result.getString(4)+ "\nContact:-" +result.getLong(5)+ "\nGender:-" +result.getString(6)+ "\nSecurity Question:-" +result.getString(7)+ "\nSecurity Answer:-" +result.getString(8)+ "\nRole:-" +result.getString(9));
		    	Customer customer=new Customer();
		    	customer.setCustomerId(result.getString(1));
		    	customer.setCustomerName(result.getString(2));
		    	customer.setCustomerPassword(result.getString(3));
		    	customer.setCustomerEmail(result.getString(4));
		    	customer.setCustomerContact(result.getLong(5));
		    	customer.setCustomerGender(result.getString(6));
		    	customer.setSecurityQuestion(result.getString(7));
		    	customer.setSecurityAnswer(result.getString(8));
		    	
		    	
		    	list.add(customer);
		    }
		    return list;
		}catch(SQLException ed)
		{
			System.out.println("Sorry Data could not be retreieved");
			System.out.println(ed);
		}
		System.out.println("Sorry Data could not be retreieved");
		return null;
	}

	@Override 
	public Customer getCustomerByCustomerEmail(String email) {
		try
		{
			con=ConnectionProvider.getConnection();			
			PreparedStatement statement=con.prepareStatement("select * from customer where customerEmail=?");
	        statement.setString(1,email);
			ResultSet result=statement.executeQuery();
			if(result.next())
			{
				System.out.println("Id:-" +result.getString(1)+ "Name:-" +result.getString(2)+ "Password:-" +result.getString(3)+ "Email:-" +result.getString(4)+ "Contact:-" +result.getLong(5)+ "Gender:-" +result.getString(6)+ "Security Question:-" +result.getString(7)+ "Security Answer:-" +result.getString(8)+ "Role:-" +result.getString(9));
				Customer customer=new Customer();
				customer.setCustomerId(result.getString(1));
				customer.setCustomerName(result.getString(2));
				customer.setCustomerPassword(result.getString(3));
				customer.setCustomerEmail(result.getString(4));
				customer.setCustomerContact(result.getLong(5));
				customer.setCustomerGender(result.getString(6));
				customer.setSecurityQuestion(result.getString(7));
				customer.setSecurityAnswer(result.getString(8));
				customer.setRole(result.getString(9));
				System.out.println("ROLE:::::::::::::::"+result.getString(9));
	return customer;
			}
		}catch(SQLException ew)
		{
			System.out.println("Exception from CustomerMedicineImpl");
			System.out.println(ew);
			
		}
		return null;
	}
	
	public Customer getCustomerById(String customerId)
	{
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("select * from customer where customerId=?");
			ResultSet result=statement.executeQuery();
			if(result.next())
			{
	System.out.println("Id:-" +result.getString(1)+ "\nName:-" +result.getString(2)+ "\nPassword:-" +result.getString(3)+ "\nEmail:-" +result.getString(4)+ "\nContact:-" +result.getLong(5)+ "\nGender:-" +result.getString(6)+ "\nSecurity Question:-" +result.getString(7)+ "\nSecurity Answer:-" +result.getString(8));
	Customer customer=new Customer();
	customer.setCustomerId(result.getString(1));
	customer.setCustomerName(result.getString(2));
	customer.setCustomerPassword(result.getString(3));
	customer.setCustomerEmail(result.getString(4));
	customer.setCustomerContact(result.getLong(5));
	customer.setCustomerGender(result.getString(6));
	customer.setSecurityQuestion(result.getString(7));
	customer.setSecurityAnswer(result.getString(8));
	return customer;
			}
		}catch(SQLException se)
		{
			System.out.println("Sorry invalid customerId.");
			System.out.println(se);
		}
		return null;
	}

	
	@Override
	public boolean validate(String email, String password) {
		try
		{
			System.out.println("yeahhhh");
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("select * from customer where customerEmail=? and customerPassword=?");
			statement.setString(1,email);
		    statement.setString(2,password);
		    ResultSet result=statement.executeQuery();
		    if(result.next())
			{
		    	System.out.println("Yes");
                 return true;
		    }
		}catch(SQLException se)
		{
			System.out.println("something went wrong");
			System.out.println(se);
		}
		System.out.println("Wrong email and password");
		return false;
	}

	

}
