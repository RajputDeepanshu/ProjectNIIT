<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

  <jsp:include page="Header.jsp"/>
  <br>
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
    
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="project/s4.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="project/s5.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="project/ss.jpg" alt="Third slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="project/s2.jpg" alt="Forth slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    
    <hr>
<center>
    <h2 style="color: black"><b>TOP SELLERS</b></h2>
</center>
    
    <div class="container">
  <div class="row">
      
      <div class="col-sm" style="margin-left: ">
        <a href="topseller.jsp"><img src="project\d1.jpg"  style="width: 80%"></a>
    </div>
    <div class="col-sm">
        <a href="topseller.jsp"><img src="project\d2.jpg"  style="width: 80%; margin-top: 10%"></a>
    </div>
    
      <div class="col-sm">
          <a href="topseller.jsp"><img src="project\d4.jpg"  style="; margin-top: 10%; width: 90%"></a>
    </div>
  </div>
  </div>
        
        
          <div class="row">
              <div class="col-sm" style="margin-left: 12%">
        <a href="topseller.jsp"><img src="project\d3.jpg"  style="width: 50%"></a>
    </div>
    <div class="col-sm">
        <a href="topseller.jsp"><img src="project\d5.jpg"  style="width: 70%;"></a>
    </div>
    <div class="col-sm">
        <a href="topseller.jsp"> <img src="project\d6.jpg"  style="width: 70%; margin-bottom: 10%"></a>
   </div>
  </div>
</div>
    
    
    
    <hr>
    
  
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	


<jsp:include page="footer.jsp"/>
</body>
</html>
