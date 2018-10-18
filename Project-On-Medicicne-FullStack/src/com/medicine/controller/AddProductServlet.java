package com.medicine.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.medicine.dao.ProductMedicine;
import com.medicine.database.ConnectionProvider;
import com.medicine.implementation.ProductMedicineImpl;
import com.medicine.model.Product;



@WebServlet("/AddProductServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*10,
maxFileSize=1024*1024*50,
maxRequestSize=1024*1024*100)
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Connection con=null;
       RequestDispatcher rd;
    public AddProductServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{    
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		double price=Double.parseDouble(request.getParameter("price"));
		double quantity=Double.parseDouble(request.getParameter("quantity"));
		String category=request.getParameter("category");
		String description=request.getParameter("description");
		Product product=new Product();
		product.setProductName(name);
		product.setProductPrice(price);
		product.setProductQuantity(quantity);
		product.setProductCategory(category);
		product.setProductDescription(description);
		Part part=request.getPart("image");
		InputStream is=part.getInputStream();
		byte []bytes=IOUtils.toByteArray(is);
		String path="E:\\eclipse-project\\Project-On-Medicicne-FullStack\\WebContent\\project";
		String fileName=path+File.separator+product.getProductId()+".jpg";
		System.out.println(fileName);
		FileOutputStream fos=new FileOutputStream(fileName);
		fos.write(bytes);
		fos.close();
		ProductMedicine  medicine=new ProductMedicineImpl();
		try
		{
			if(medicine.addProduct(product))
			{
				rd=request.getRequestDispatcher("/product.jsp");
				rd.forward(request,response);
			}
			else
			{
				rd=request.getRequestDispatcher("/addproduct.jsp");
				rd.include(request,response);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
