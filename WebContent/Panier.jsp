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

	<h2 class="mx-auto text-center" id="title">Les indispensables pour peindre ta pièce</h2>
	
	<h5 id="sousTitre">Voici <strong>des produits adaptés</strong> à ton projet, tu peux choisir de les supprimer ou non de ton panier ManoMano.</h5>

	<div class="container">

		<div class="card" id="carte">

			<div class="card-body">
				<h4 class="cardTitle">Peinture  pour ${projet.surface } m²</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${peinture.image }
						alt="Card image cap"> <span class="col-sm-3"><a href=${peinture.lien}>${peinture.nomProduit }</a></span>
					<div class="col-sm" id="price">${peinture.prix }€</div>
				</div>
			</div>
		</div>

		<div class="card" id="carte">

			<div class="card-body">
				<h4 class="cardTitle">Sous-couche</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${undercoat.imgSC }
						alt="Card image cap"> <span class="col-sm-3"><a href=${undercoat.lienSC}>${undercoat.nomSC }</a></span>
					<div class="col-sm" id="price">${undercoat.prix }€</div>
				</div>
			</div>
		</div>
		<div class="card" id="carte">

			<div class="card-body">
				<h4 class="cardTitle">Rouleau(x) et accessoire(s)</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${roll.imgR }
						alt="Card image cap"> <span class="col-sm-3"><a href=${roll.lienR}>${roll.nomRouleau }</a></span>
					<div class="col-sm" id="price">${roll.prix }€</div>
				</div>
			</div>
		</div>
		<div class="card" id="carte">

			<div class="card-body">
				<h4 class="cardTitle">Adhésif de masquage</h4>
				<div class="bodyCarte">
					<img class="col-sm-3" id="konoDio" src=${stripe.imgA }
						alt="Card image cap"> <span class="col-sm-3"><a href=${stripe.lienA}>${stripe.nomA }</a></span>
					<div class="col-sm " id="price">${stripe.prix }€</div>
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