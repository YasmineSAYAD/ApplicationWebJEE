<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="Assets/favicon.ico">

   

    <!-- Bootstrap core CSS -->
    <link href="Assets/css/bootstrap.min.css" rel="stylesheet">
  <link href="Assets/css/foot.css" rel="stylesheet">
   

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="Assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="Assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/FA9501AA-D25E-904A-B7B0-609C5DE6F58B/main.js" charset="UTF-8"></script><script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
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
            <li class="active"><a href="http://localhost:8081/GestionCriminels/GestionEnquete">Gestion enquête</a></li>
             <li ><a href="http://localhost:8081/GestionCriminels/Gestion">Gestion</a></li>
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
		<img src="Images/ajout.png" />
	</p>
	<p>
		<a href="http://localhost:8081/GestionCriminels/AjoutEnquete">Ajouter une enquête</a>
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
	  	<img src="Images/maj.png" />
	</p>
	<p>
		<a href="http://localhost:8081/GestionCriminels/ListeEnquete">Mise à jour</a>
	</p>
</div>

</div>
</div>

             </div>

	</div>
</div>
		<br><br><br><br><br>
    <div class="row">
    <div>	<%@ include file="/f.jsp" %></div></div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="Assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="Assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>