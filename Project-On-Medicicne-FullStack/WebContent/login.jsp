<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>

  <body>
  
         <jsp:include page="Header.jsp"/>
     <form action="LoginServlet" method="post">
     <div class="container" style="padding-top:50px;">
      <div class="card card-login mx-auto mt-5">
        <div class="card-header"><b>Login</b></div>
        <div class="card-body">
       
          
            <div class="form-group">
              <div class="form-label-group">
              <label for="inputEmail"><b>Email address</b> </label>
                <input type="email" name="email" class="form-control" placeholder="Email address" required autofocus="autofocus">
              </div>
            </div>
            <div class="form-group">
              <div class="form-label-group">
                              <label for="inputPassword"><b>Password</b></label>
               <input type="password" name="password" class="form-control" placeholder="Password" required>
              </div>
            </div>
            <div class="form-group">
              <div class="checkbox">
                <label>
                  <input type="checkbox" value="remember-me">
                  Remember Password
                </label>
              </div>
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Login">
          </form>
          <div class="text-center">
            <a class="d-block small mt-3" href="register.jsp">Register an Account</a>
          </div>
        


    
   
</form>
  

      <!-- Modal -->
      
     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<jsp:include page="footer.jsp"/>

  </body>

</html>
