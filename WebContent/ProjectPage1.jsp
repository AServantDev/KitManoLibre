<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="home.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>
<body id="homeBody">

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container page-wrapper" id="home-page-wrapper">
		
			<h2 class="float-sm-left" id="go">Tu as décidé de t’y mettre ?</h2>

			<h3 class="d-flex justify-content-center" id="welcome">Nous sommes là pour t’aider ! Découvre ta sélection personnalisée de <strong>produits indispensables</strong> et <strong>conseils</strong> pour réussir ton projet !</h3>
		
			<a id="parti-container" href="CreateNewProjetPeinture"><button id="parti" type="button" class="btn btn-primary">C'est parti !</button></a>
	</div>


</body>
</html>