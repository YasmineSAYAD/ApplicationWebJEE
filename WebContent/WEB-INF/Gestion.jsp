<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Gestion</title>

    <!-- Bootstrap -->
    <link href="Assets/css/bootstrap.min.css" rel="stylesheet">
     <link href="/f.jsp" rel="stylesheet">
   

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
    <nav class="navbar navbar-inverse navbar-fixed-top">
   <img src="Images/logo.png" /> 
   <br><br>
      <div class="container">
        <div class="navbar-header">
        
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
         
        </div>
        <div id="navbar" class="collapse navbar-collapse">
       
          <ul class="nav navbar-nav">
            <li class="active"><a href="http://localhost:8081/GestionCriminels/Gestion">Gestion</a></li>
            <li><a href="http://localhost:8081/GestionCriminels/Login.jsp">Déconnexion</a></li>
            
          </ul>
            
        </div><!--/.nav-collapse -->
      
      </div>
       
    </nav>
 
     
    <br><br><br> <br><br><br> <br><br> <br><br><br><br>
 
    <div class="container-fluid">
<div class="row">
		<div class="col-md-6">
		<div class="jumbotron">
	<div class="text-center">
		<div>
	<p>
		<img src="Images/criminel.JPG" />
	</p>
	<p>
		<a href="http://localhost:8081/GestionCriminels/GestionCriminel">Gestion des criminels</a>
	</p>
</div>
</div>
</div>
		
             </div>
<div class="col-md-6">
<div class="jumbotron">
	<div class="text-center">
	<div>
	<p>
	  	<img src="Images/Policier.JPG" />
	</p>
	<p>
		<a href="http://localhost:8081/GestionCriminels/GestionPolicier">Gestion des policiers</a>
	</p>
</div>

	
	
	
</div>
</div>

             </div>

	</div>
</div>





    
    <div class="container-fluid">
<div class="row">
		<div class="col-md-6">
		<div class="jumbotron">
	<div class="text-center">
		<div>
	<p>
		<img src="Images/enquete.JPG" />
	</p>
	<p>
		<a href="http://localhost:8081/GestionCriminels/GestionEnquete">Gestion des enquêtes</a>
	</p>
</div>
</div>
</div>
		
             </div>
<div class="col-md-6">
<div class="jumbotron">
	<div class="text-center">
	<div>
	<p>
	  	<img src="Images/consulter.jpeg" />
	</p>
	<p>
		<a href="http://localhost:8081/GestionCriminels/Consultation">Je consulte mes enquêtes</a>
	</p>
</div>

	
	
	
</div>
</div>

             </div>

	</div>
</div>
    
 
    
    <br><br><br><br><br>
    <div class="container-fluid">
<div class="row">
		
     <div>	<%@ include file="/f.jsp" %></div>
</div></div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="Assets/js/bootstrap.min.js"></script>
  </body>
  
</html>