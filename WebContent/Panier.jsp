<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<link href="https://fonts.googleapis.com/css?family=Open+Sans"
	rel="stylesheet">

<link rel="stylesheet" href="home.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Panier d'ses morts</title>

</head>

<body id="bodyPanier">

	<jsp:include page="header.jsp"></jsp:include>

	<h2 class="mx-auto text-center" id="title">Peindre une pièce</h2>

	<div class="container">

		<div class="card" id="carte">

			<div class="card-body">
				<h4>Peinture</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${peinture.image }
						alt="Card image cap"> <span class="col-sm-3">${peinture.nomProduit }</span>
					<div class="col-sm price">${peinture.prix }€</div>
				</div>
			</div>
		</div>

		<div class="card" id="carte">

			<div class="card-body">
				<h4>Sous-couche</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${undercoat.imgSC }
						alt="Card image cap"> <span class="col-sm-3">${undercoat.nomSC }</span>
					<div class="col-sm price">${undercoat.prix }€</div>
				</div>
			</div>
		</div>
		<div class="card" id="carte">

			<div class="card-body">
				<h4>Rouleaux</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${roll.imgR }
						alt="Card image cap"> <span class="col-sm-3">${roll.nomRouleau }</span>
					<div class="col-sm price">${roll.prix }€</div>
				</div>
			</div>
		</div>
		<div class="card" id="carte">

			<div class="card-body">
				<h4>Adhésif de masquage</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${stripe.imgA }
						alt="Card image cap"> <span class="col-sm-3">${stripe.nomA }</span>
					<div class="col-sm price">${stripe.prix }€</div>
				</div>
			</div>
		</div>

	</div>

<br>
	<div class="zbi">
		<button type="button" class="btn btn-primary btn-lg btn-block">Accéder
			au panier</button>
	</div>

</body>

</html>