<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="home.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800"
	rel="stylesheet">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Choisi la pièce!</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<div class="container page-wrapper" id="choix-page-wrapper">


		<div class="container justify-content-center ">
			<div class=" row">

				<h1 class="pieceTitre">Quelle pièce souhaites-tu peindre ?</h1>

				<div class="column d-flex justify-content-center">

					<a href="addRoom?nomPiece=chambre"><input
						class="form-check-input" type="hidden" id="inlineCheckbox1"
						value="chambre"> <label class="form-check-label"
						for="inlineCheckbox1"><img class="piece"
							src="image/Boutons/Chambre.png"></label></a>
							
							<a href="addRoom?nomPiece=cuisine"> <input
						class="form-check-input" type="hidden" id="inlineCheckbox1"
						value="cuisine"> <label class="form-check-label"
						for="inlineCheckbox1"><img class="piece"
						src="image/Boutons/Cuisine.png"></label></a>
				</div>

			</div>

			<div class="row">

				<div class="column">

					<a href="addRoom?nomPiece=SdB"><input class="form-check-input" type="hidden" id="inlineCheckbox1"
						value="SdB"> <label class="form-check-label"
						for="inlineCheckbox1"><img class="piece"
						src="image/Boutons/SdB.png"></label></a>
						<a href="addRoom?nomPiece=salon"> <input class="form-check-input"
						type="hidden" id="inlineCheckbox1" value="salon"> <label
						class="form-check-label" for="inlineCheckbox1"><img
						class="piece" src="image/Boutons/Salon.png"></label></a>
				</div>

			</div>
		</div>
		
	</div>


</body>

</html>