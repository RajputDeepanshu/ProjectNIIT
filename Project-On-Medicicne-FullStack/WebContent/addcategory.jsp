<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ffffcc">
<center>
<form action="AddCategoryServlet" method="post">
<table cellpadding="10" cellspacing="10" style="background-color:wheat ; margin-top:10%">
<thead><h1><b>ADD CATEGORY HERE</b></h1></thead>
<tr>
<td>Category-Name</td>
<td><input type="text" name="name" placeholder="category-name" required></td>
</tr>

<tr>
<td>Category-Description</td>
<td><textarea row="10" cols="50" name="description" placeholder="category-description" required></textarea></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="ADD"></td>
</tr>

</table>
</form>
</center>
</body>
</html>