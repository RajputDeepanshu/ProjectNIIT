<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<center>
<form action="AddProductServlet" method="post" enctype="multipart/form-data">
<table cellspacing="10" callpading="10">
<thead><h1><b>Add Product Here</b></h1></thead>
<tr>
<td>Product Name</td>
<td><input type="text" name="name" required placeholder="Product-Name"></td>
</tr>

<tr>
<td>Product-Price</td>
<td><input type="text" name="price" required placeholder="Product-Name"></td>
</tr>

<tr>
<td>Product-Quantity</td>
<td><input type="text" name="quantity" required placeholder="Product-Name"></td>
</tr>

<tr>
<td>Image</td>
<td><input type="file" name="image">Choose File</td>
</tr>


<tr>
<td>Product-Category</td>
<td><input type="text" name="category" required placeholder="Product-Name"></td>
</tr>

<tr>
<td>Product-Description</td>
<td><textarea row="10" cols="20" name="description"></textarea></td>
</tr>


<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</tr>


</table>
</form>
</center>
</body>
</html>