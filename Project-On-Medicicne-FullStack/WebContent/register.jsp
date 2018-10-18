
<!doctype html>
<html>

<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>

<body style=" background-image:url(project/jp.jpg) ; background-repeat:no-repeat ">
   
   <jsp:include page="Header.jsp"/>
  
    
<form action="SignupServlet" method="post">
<center>
<table cellspacing="5" cellpadding="5" style=" margin-top:5% ">


<tr>
<td><b>User-Name</b></td>
<td><input type="text" name="name" placeholder="Name" required></td>
</tr>

<tr>
<td><b>Password</b></td>
<td><input type="password" name="password" placeholder="Password" required></td>
</tr>

<tr>
<td><b>Email</b></td>
<td><input type="text" name="email" placeholder="Email" required></td>
</tr>

<tr>
<td><b>Contact</b></td>
<td><input type="text" name="contact" placeholder="Contact" required></td>
</tr>

<tr>
<td><b>Gender</b></td>
<td><input type="radio" name="gender" value="Male">Male &nbsp;<input type="radio" name="gender" value="Female">Female</td>
</tr>

<tr>
<td><b>Security-Question</b></td>
<td>
<select name="question">
<option value="">------Select Question------</option>
<option value="What was your First School">What was your First School</option>
<option value="How old was you in 2017">How old was you in 2017</option>
<option value="Friends call you">Friends call you</option>
<option value="your favourite teacher">your favourite teacher</option>
</select>
</td>
</tr>

<tr>
<td><b>Security-Answer</b></td>
<td><input type="text" name="answer" placeholder="Name" required></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="register"> &nbsp;&nbsp;<a href="forgot.jsp">forgot password</a></td>
</tr>


</table>
</center>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
<jsp:include page="footer.jsp"/>

</body>

</html>