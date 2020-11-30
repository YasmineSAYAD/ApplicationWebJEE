<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Liste des policiers</title>

    <!-- Bootstrap -->
    <link href="Assets/css/table.css" rel="stylesheet">
       <link href="Assets/css/foot.css" rel="stylesheet">
       

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
<div>	<%@ include file="/NavBarLP.jsp" %></div>
     
    <br><br><br> <br><br><br> <br><br> <br><br><br><br>
    
   <form action="ListePolicier" method="post">
		<div class="row">
		
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<label for="inputEmail" class="sr-only">Rechercher</label> <input
						type="text" id="idrech" name="nomrech" class="form-control">
					<button class="btn btn-lg btn-primary btn-block" type="submit"
						name="recherche" value="rech">Rechercher</button>
		
						<button class="btn btn-lg btn-primary btn-block" type="submit"
							name="actualiser" value="act">Actualiser</button>
					

				</div>
				<div class="col-md-4"></div>
			
		</div>
	</form>
	<br><br>

	<%  request.getAttribute("lp"); %>
 
  <div class="container scroll">
          <table class="table isSearch" cellspacing="0">
            <thead>
              <tr class="table-heads ">
             
              <th class="head-item mbr-fonts-style display-7">Matricule</th>
                     <th class="head-item mbr-fonts-style display-7"> Nom</th>
                       <th class="head-item mbr-fonts-style display-7"> Prenom</th>
                          <th class="head-item mbr-fonts-style display-7"> Date de naissance</th>
                             <th class="head-item mbr-fonts-style display-7">Grade</th>
                              <th class="head-item mbr-fonts-style display-7">id commissariat</th>
                               <th class="head-item mbr-fonts-style display-7"> Maj</th>
                     
                     </tr>
            </thead>

            <tbody>
         	<a:forEach items="${lp}" var="i">
            <tr> 
            
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.matricule}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.nom_p}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.prenom_p}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.dateNais}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.grade_p}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.id_cm}"></a:out></td>
              <td><form action="MajPolicier" method="post">
	
						<input type="hidden" name="supprimer" value="supprimer" />
						<!-- partie visible a l'utilisateur -->
						<input type="submit" name="supprimer" value="supprimer" />
					</form></td>
            
             </tr></a:forEach></tbody></table></div>
             <br><br><br><br><br>
             <br><br><br><br><br><br><br>
              <br><br><br><br><br><br><br>
  <div class="row">  
    <div>	<%@ include file="/f.jsp" %></div></div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="Assets/js/bootstrap.min.js"></script>
  </body>
</html>