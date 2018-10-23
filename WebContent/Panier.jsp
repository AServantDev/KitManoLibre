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

		<div class="card">

			<h4 class="card-header">Peinture</h4>
			<div class="card-body">
				<img class="col-sm-3 card-image" id="konoDio" src="https://cdn.manomano.fr/peinture-guittet-mat-78-hydro-confort-blanc-P-356975-9185696_1.jpg"
					alt="Card image cap">
				<div class="card-body-text">
					<p class="col-sm-3 card-name">Peinture GUITTET MAT 78 HYDRO+ CONFORT BLANC</p>
					<p class="col-sm card-price">14€</p>
				</div>
			</div>
		</div>

		<div class="card">

			<h4 class="card-header">Sous-couche</h4>
			<div class="card-body">
				<img class="col-sm-3 card-image" id="konoDio" src="https://cdn.manomano.fr/sous-couche-universelle-addict-P-338-3989626_1.jpg"
					alt="Card image cap">
				<div class="card-body-text">
					<p class="col-sm-3 card-name">Peinture addict sous-couche universelle</p>
					<p class="col-sm card-price">16,54€</p>
				</div>
			</div>
		</div>
		<div class="card">

			<h4 class="card-header">Rouleaux</h4>
			<div class="card-body">
				<img class="col-sm-3 card-image" id="konoDio" src="https://cdn.manomano.fr/lot-9-pieces-pour-decorateur-9-pcs-P-149211-335307_1.jpg"
					alt="Card image cap">
				<div class="card-body-text">
					<p class="col-sm-3 card-name">Kit de peinture 9 pièces</p>
					<p class="col-sm card-price">6,19€</p>
				</div>
			</div>
		</div>
		<div class="card">
			<h4 class="card-header">Adhésif de masquage</h4>
			<button>Supprimer</button>
			<div class="card-body">
				<img class="col-sm-3 card-image" id="konoDio" src=https://cdn.manomano.fr/ruban-de-masquage-50m-x-50mm-P-204211-713473_1.jpg
					alt="Card image cap">
				<div class="card-body-text">
					<p class="col-sm-3 card-name">Ruban de masquage 50m x 50mm</p>
					<p class="col-sm card-price">2,15€</p>
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