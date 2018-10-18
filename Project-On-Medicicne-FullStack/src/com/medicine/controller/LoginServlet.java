package com.medicine.controller;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.medicine.dao.CustomerMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.implementation.CustomerMedicineImpl;
import com.medicine.model.Customer;


public class LoginServlet extends HttpServlet 
{
	private Connection con=null;
	private static final long serialVersionUID = 1L;
       
	RequestDispatcher rd;
    public LoginServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try
		{
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	    CustomerMedicine dao=new CustomerMedicineImpl();
	    
	    if(dao.validate(email, password))
	    {
	    	System.out.println("EmailId"+email);
	    HttpSession session=request.getSession();
	    Customer user=dao.getCustomerByCustomerEmail(email);
	    session.setAttribute("customer",user);
	    if(user.getRole().equals("ROLE_ADMIN"))
	    {
	    	System.out.println("admin is checking");
	    rd=request.getRequestDispatcher("/admin.jsp");
		rd.forward(request,response);
	    }
	    else
	    {
	    	rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request,response);
		    	
	    }
	    }
	    else
	    {
	    	rd=request.getRequestDispatcher("/login.jsp");
			rd.forward(request,response);
	    }
	    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	
	}

	}
