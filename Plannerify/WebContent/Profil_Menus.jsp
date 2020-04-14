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

<%String email_organisateur=(String)session.getAttribute("email_organisateur");  //recuperer l'email de l'organisateur

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
				<p>Plannerify your parties</p>
				<h2>Mes Menus</h2>
			</header>
		</div>
	</section>

	<!-- Main -->
	<div id="main" class="container">
		<%! List<Menu> premiereListe; %>
		<%premiereListe= Profil_Menus. Afficher_Menu_Profil(email_organisateur); %>
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
							src="images/dress12.jpg" />


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
					<a href="Add_Menu.jsp?id=<%=str.getId_Menu()%>&id_organisateur=<%=str.getId_Organisateur()%>" 
					class="button special" style="float: right">Modifier</a>

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
		<div class="copyright">&copy; Plannerify.</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>