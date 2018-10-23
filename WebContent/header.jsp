<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
<head>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body id="headerBody">

	<nav class="navbar navbar-inverse " id="navHead">

		<div class="container-fluid">

			<div id="navHead-horizontal" class="navbar-header">
				<header id="navHead-horizontal-header">
					<img src="image/logo_kml-03.png" id="logo">
	
					<span id="titre" class="">Kit Mano Libre</span>
				</header>

				<button type="button" class="navbar-toggle " data-toggle="collapse"
					data-target="#myNavbar" id="btnNav">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>

			<div class="collapse navbar-collapse nav navbar-nav navbar-right" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="ProjectPage1.jsp" class="list">Home</a></li>
					<li><a href="#" class="list">Profil</a></li>
					<li><a href="#" class="list">Evénement</a></li>
					<li><a href="#" class="list">Création</a></li>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>