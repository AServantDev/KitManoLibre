<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dimension</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<div class="container page-wrapper" id="choix-page-wrapper">

		<h1 class="row pieceTitre">Quelles sont les dimensions de la surface à peindre ?</h1>

		<form id="dimensions-form" action="AddDim" method="get">
			<div class="bla">
				<input type="number" id="dim" name="dim" required max="100"><span class="validity"></span>
				<label id="bla-text-meter" for="dim">m²</label>
			</div>

			<button id="dimensions-submit-button" class="btn btn-primary" type="submit">
				<strong>Done !</strong>
			</button>
		</form>
		
	</div>
	
</body>
</html>