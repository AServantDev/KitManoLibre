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

<title>Panier</title>

</head>

<body id="bodyPanier">

	<jsp:include page="header.jsp"></jsp:include>

	<h2 class="mx-auto text-center" id="title">Les indispensables pour peindre ta pièce</h2>
	
	<h5 id="sous-titre">Voici <strong>des produits adaptés</strong> à ton projet, tu peux choisir de les supprimer ou non de ton panier ManoMano.</h5>

	<div class="container">

		<div class="card">

			<h4 class="card-header">Peinture</h4>
			<div class="card-body">
				<a href=${peinture.lien}><img class="col-sm-3 card-image" id="konoDio" src=${peinture.image }
					alt="Card image cap"></a>
				<div class="card-body-text">
					<p class="col-sm-3 card-name"><a class="card-body-text-link" href=${peinture.lien}>${peinture.nomProduit }</a></p>
					<p class="col-sm card-price">${peinture.prix}€</p>
				</div>
			</div>
		</div>

		<div class="card">

			<h4 class="card-header">Sous-couche</h4>
			<div class="card-body">
				<a href=${undercoat.lienSC}><img class="col-sm-3 card-image" id="konoDio" src=${undercoat.imgSC }
					alt="Card image cap"></a>
				<div class="card-body-text">
					<p class="col-sm-3 card-name"><a class="card-body-text-link" href=${undercoat.lienSC}>${undercoat.nomSC }</a></p>
					<p class="col-sm card-price">${undercoat.prix }€</p>
				</div>
			</div>
		</div>
		<div class="card">

			<h4 class="card-header">Rouleaux</h4>
			<div class="card-body">
				<a href=${roll.lienR}><img class="col-sm-3 card-image" id="konoDio" src=${roll.imgR }
					alt="Card image cap"></a>
				<div class="card-body-text">
					<p class="col-sm-3 card-name"><a class="card-body-text-link" href=${roll.lienR}>${roll.nomRouleau }</a></p>
					<p class="col-sm card-price">${roll.prix }€</p>
				</div>
			</div>
		</div>
		<div class="card">
			<h4 class="card-header">Adhésif de masquage</h4>
			<div class="card-body">
				<a href=${stripe.lienA}><img class="col-sm-3 card-image" id="konoDio" src=${stripe.imgA }
					alt="Card image cap"></a>
				<div class="card-body-text">
					<p class="col-sm-3 card-name"><a class="card-body-text-link" href=${stripe.lienA}>${stripe.nomA }</a></p>
					<p class="col-sm card-price">${stripe.prix }€</p>
				</div>
			</div>
		</div>

	</div>

	
	<div class="zbi">
		<button type="button" id="panier-access-button" class="btn btn-primary btn-lg btn-block">Accéder
			au panier</button>
	</div>

</body>

</html>