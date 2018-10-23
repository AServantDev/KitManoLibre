<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Open+Sans"
	rel="stylesheet">
<link rel="stylesheet" href="home.css">
<meta charset="UTF-8">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Panier</title>
</head>

<body id="bodyPanier">

	<jsp:include page="header.jsp"></jsp:include>

	<h2 class="mx-auto text-center" id="title">Peindre une pièce</h2>

	<div class="container" class="carte">

		<div class="card bg-light">

			<div class="card-body">
				<div>Peinture</div>
				<img class="col-sm" id="konoDio" src=${peinture.image }
					alt="Card image cap">
				<h5 class="col-sm">${peinture.nomProduit }</h5>
				<div class="col-sm">${peinture.prix }€</div>
			</div>
		</div>

	</div>


	<div class="zbi">
		<button type="button" class="btn btn-primary btn-lg btn-block">Accéder
			au panier</button>
	</div>
</body>

</body>

</html>