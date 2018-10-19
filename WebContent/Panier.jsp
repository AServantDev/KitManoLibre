<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="home.css">
<link href="https://fonts.googleapis.com/css?family=Open+Sans"
	rel="stylesheet">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Panier</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<h2 class="mx-auto text-center" id="title">Peindre une pièce</h2>


	<div>${projetpeinture.idRouleaux }</div>
	<div>${roll.nomRouleau }</div>
	<img src=${roll.imgR }>

	<div class="container " class="carte">
		<div class="card text-left">
			<div class="card-header">
				Sous couche <a href="#" class="btn btn-primary">Supprimer</a>
			</div>
			<div class="card-body">
				<h5 class="card-title">La peinture d'la mort</h5>
				<p class="card-text">With supporting text below as a natural
					lead-in to additional content.</p>

			</div>
		</div>
	</div>
	
	<div class="zbi"><button type="button" class="btn btn-primary btn-lg btn-block">Accéder au panier</button></div>

</body>
</html>