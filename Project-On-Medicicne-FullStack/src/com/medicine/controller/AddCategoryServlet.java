package com.medicine.controller;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medicine.dao.CategoryMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.implementation.CategoryMedicineImpl;
import com.medicine.model.Category;

@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Connection con=null;
       RequestDispatcher rd;
    public AddCategoryServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			con=ConnectionProvider.getConnection();
			PrintWriter out=response.getWriter();
			String name=request.getParameter("name");
			String description=request.getParameter("description");
			Category category=new Category();
			category.setCategoryName(name);
			category.setCategoryDescription(description);
			CategoryMedicine dao=new CategoryMedicineImpl();
			if(dao.addCategory(category))
			{
			rd=request.getRequestDispatcher("/admin.jsp");
			rd.forward(request,response);
			}
			else
			{
				rd=request.getRequestDispatcher("/addcategory.jsp");
				rd.forward(request,response);
			}
		}catch(Exception e)
		{
		System.out.println("Exception occur from AddCategoryServlet");
		}
		
	}

}
