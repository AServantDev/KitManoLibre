<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Open+Sans"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dimension</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<center>
		<h1 class="pieceTitre">Quelles sont les<br> dimensions de la surface<br>
			à peindre ?</h1>
	</center>
	<br>
	<br>
	<form action="AddDim" method="get">
		<div class="bla">
			<input type="number"  id="dim" name="dim" required max = "100"><span class="validity"></span> <label for="dim"><strong>m²</strong></label>
		</div>
		<br> <br> <br>
		<button id="done" class="btn btn-primary" type="submit">
			<strong>Done !</strong>
		</button>
	</form>
</body>
</html>