<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="home.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Kit Mano Libre - Pièce</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<div class="container page-wrapper" id="choix-page-wrapper">

		<div class="container justify-content-center ">
		
			<h1 class="row pieceTitre">Quelle pièce souhaites-tu peindre ?</h1>
			
			<div class=" row">
				<div class="column d-flex justify-content-center">

					<a href="ProjetPeintureController?idProjetPeinture=1"><input
						class="form-check-input" type="hidden" id="inlineCheckbox1"
						value="chambre"> <label class="form-check-label"
						for="inlineCheckbox1"><img class="piece"
							src="image/Boutons/Chambre.png"></label></a> <input
						class="form-check-input" type="hidden" id="inlineCheckbox1"
						value="cuisine"> <label class="form-check-label"
						for="inlineCheckbox1"><img class="piece"
						src="image/Boutons/Cuisine.png"></label>
				</div>

			</div>

			<div class="row">

				<div class="column">

					<input class="form-check-input" type="hidden" id="inlineCheckbox1"
						value="SdB"> <label class="form-check-label"
						for="inlineCheckbox1"><img class="piece"
						src="image/Boutons/SdB.png"></label> <input class="form-check-input"
						type="hidden" id="inlineCheckbox1" value="salon"> <label
						class="form-check-label" for="inlineCheckbox1"><img
						class="piece" src="image/Boutons/Salon.png"></label>
				</div>

			</div>
		</div>
	</div>


</body>

</html>