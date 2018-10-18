package com.medicine.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medicine.dao.CustomerMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.implementation.CustomerMedicineImpl;
import com.medicine.model.Customer;


public class SignupServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	private Connection con=null;
	RequestDispatcher rd;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		Long contact=Long.parseLong(request.getParameter("contact"));
        String gender=request.getParameter("gender");
        String question=request.getParameter("question");
        String answer=request.getParameter("answer");
        
        Customer customer=new Customer();
        
        customer.setCustomerName(name);
        customer.setCustomerPassword(password);
        customer.setCustomerEmail(email);
        customer.setCustomerContact(contact);
        customer.setCustomerGender(gender);
        customer.setSecurityQuestion(question);
        customer.setSecurityAnswer(answer);
                CustomerMedicine dao=new CustomerMedicineImpl();
         if(dao.addCustomer(customer))
         {
        	 rd=request.getRequestDispatcher("/login.jsp");
        	 rd.forward(request,response);
         }
         else
         {
        	 rd=request.getRequestDispatcher("/register.jsp");
        	 rd.include(request,response);
         }
		}catch(Exception e)
		{
			
			e.printStackTrace();
		}

	}

}
