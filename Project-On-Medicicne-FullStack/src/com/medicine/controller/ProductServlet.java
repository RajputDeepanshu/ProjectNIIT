package com.medicine.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medicine.dao.ProductMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.implementation.ProductMedicineImpl;
import com.medicine.model.Product;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Connection con=null;
       RequestDispatcher rd;
    
    public ProductServlet() {
        super();
    
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	    {
		String action=request.getParameter("action");
		
		if("Add Product".equals(action))
		{
			rd=request.getRequestDispatcher("/addproduct.jsp");
			rd.forward(request,response);
		}
		else if("Modify Product".equals(action))
		{
			rd=request.getRequestDispatcher("/modifyproduct.jsp");
            rd.forward(request,response);
		}
		else if("Update  Product".equals(action))
		{
			rd=request.getRequestDispatcher("/updateproduct.jsp");
            rd.forward(request,response);
		}
		else if("Delete Product".equals(action))
		{
			rd=request.getRequestDispatcher("/delete.jsp");
            rd.forward(request,response);
		}
		}
}
