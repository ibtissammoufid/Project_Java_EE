<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="Model.*"%>
<!DOCTYPE HTML>

<html>
<head>
<title>Plannerify</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body class="subpage">

<%String type=request.getParameter("type"); //recuperer le type de l'organisateur

%>

	<!-- Header -->
	<header id="header">
		<div class="logo">
			<a href="index.html">Planner<span>ify</span></a>
		</div>
		<a href="#menu">Menu</a>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="index.html">Home</a></li>
			<li><a href="generic.html">Generic</a></li>
			<li><a href="elements.html">Elements</a></li>
		</ul>
	</nav>

	<!-- One -->
	<section id="One" class="wrapper style3">
		<div class="inner">
			<header class="align-center">
				<p>Quel fardeau tout de même pour une femme d'être née trop
					belle</p>
				<h2>ROBES ET CAFTANS</h2>
			</header>
		</div>
	</section>

	<!-- Main -->
	<div id="main" class="container">
		<%! List<Menu> premiereListe; %>
		<%premiereListe= Menus.Afficher(type); %>
		<%for(Menu str:premiereListe){ %>
		<div class="container body-content">




			<div class="container">


				<div class="row justify-content-end" style="padding-top: 10px;">
					<label><%= str.getNom_Menu() %></label>



				</div>
				<div class="row justify-content-start" style="padding-top: 10px;">

					<div class="col" style="padding-top: 10px;">


						<img alt="Image html" width="90%" height="90%"
							style="max-height: 500px; max-width: 500px;"
							src="images/dress.jpg" />


					</div>
					<div class="col" style="padding-top: 10px;">

						<div class="row justify-content-center" style="padding-top: 10px;">
							<label><%= str.getPrix_Menu() %> DH</label>



						</div>
						<div class="row justify-content-end" style="padding-top: 10px;">
							<p class="text-black-50">
								<%= str.getDescription_Menu() %>
							</p>
						</div>
					</div>
				</div>
				<div class="row justify-content-end" style="padding-top: 10px;">
					<a href="Reservation.jsp?id=<%=str.getId_Menu()%>&id_organisateur=<%=str.getId_Organisateur()%>" 
					class="button special" style="float: right">Réserver</a>   <a href="Visiter_Profil.jsp?id_organisateur=<%=str.getId_Organisateur()%>" 
					class="button special" style="float: right">Visiter le profil</a>
					
					  
				</div>
				


			</div>



		</div>
		<% } %>

	</div>




	<!-- Footer -->
	<footer id="footer">
		<div class="container">
			<ul class="icons">
				<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="#" class="icon fa-facebook"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon fa-instagram"><span
						class="label">Instagram</span></a></li>
				<li><a href="#" class="icon fa-envelope-o"><span
						class="label">Email</span></a></li>
			</ul>
		</div>
		<div class="copyright">&copy;Plannerify.</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>