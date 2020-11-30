<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Liste des criminels</title>

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
 <div>	<%@ include file="/NavBarLC.jsp" %></div>
  <br><br><br><br>
<form action="MajCriminel" method="post">
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
 <div class="container-fluid">
<div class="row">
		<div class="col-md-12">
 <div class="container scroll">
          <table class="table isSearch" cellspacing="0">
            <thead>
              <tr class="table-heads ">
             
              <th class="head-item mbr-fonts-style display-7">Nom</th>
                     <th class="head-item mbr-fonts-style display-7"> Prenom</th>
                       <th class="head-item mbr-fonts-style display-7"> Code</th>
                          <th class="head-item mbr-fonts-style display-7"> Date incrimination</th>
                             <th class="head-item mbr-fonts-style display-7"> Durée incrimination</th>
                               <th class="head-item mbr-fonts-style display-7"> Maj</th>
                     
                     </tr>
            </thead>

            <tbody>
         	<a:forEach items="${lc}" var="i">
            <tr> 
            
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.nom_C}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.prenom_C}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.code_c}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.date_incrimination}"></a:out></td>
              <td class="body-item mbr-fonts-style display-7"><a:out value="${i.duree_incrimination}"></a:out></td>
             <td><input type="submit" name="modifier" value="modifier" /> </td>
             <td><form action="MajCriminel" method="post">
	
						<!-- partie programmation -->
						<input type="hidden" name="modifier" value="modifier" />
						<!-- partie visible a l'utilisateur -->
						<input type="submit" name="modifier" value="modifier" />
					</form></td>
						
            
             </tr></a:forEach></tbody></table>
			

</div>

		</div></div></div>
		
			<br><br><br><br><br><br><br><br><br>
    
    <div>	<%@ include file="/f.jsp" %></div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="Assets/js/bootstrap.min.js"></script>
  </body>
</html>