<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product</title>
</head>
<body style=" background-image:url(project/pixa.jpg) ; background-repeat:no-repeat ">
<center>
<form action="ProductServlet" method="post">
<table cellpassing="10" cellspacing="10" style="margin-top=10%">
<thead><h1><b>PRODUCT PAGE</b></h1></thead>

<tr>
<td><h3><b>Add-Product</b></h3></td>
<td><input type="submit" value="Add Product" name="action"></td>
</tr>

<tr>
<td><h3><b>Modify-Product</b></h3></td>
<td><input type="submit" value="Modify Product" name="action"></td>
</tr>

<tr>
<td><td><a href="admin.jsp"><input type="button" value="Back"></a> </td>
</tr>
</table>
</form>
</center>
</body>
</html>
