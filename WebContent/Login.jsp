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
    <link rel="icon" href="../../favicon.ico">


    <!-- Bootstrap core CSS -->
    <link href="Assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="Assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="Assets/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
	
  <body  >
 
  <div class="text-center">
		<div>
			<p>
				<img src="Images/poli.png" />

			</p>
		</div>
	</div>
	<b style="color:red;">
	<%
	String msg=(String)request.getAttribute("msg");
	if(msg!=null){out.println(msg);}
	%>
	</b>
	<div class="container">
	
		<div class="jumbotron">

			<form action="Login" method="post">
				<div class="container">
					
						<div class="text-center">
							<!-- code du login -->
							<form action="Login" method="post">
								
								 <input type="text" id="matricule" name="matricule"
									class="form-control" placeholder="Matricule" required autofocus>
									
									 
									 <input type="password" id="psw"
									class="form-control"  name="psw" placeholder="Password" required>
								<br><br>
								<button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
							</form>
						</div>
				
			</form>
		</div>
	</div>
	</div>
	



    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="Assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>


