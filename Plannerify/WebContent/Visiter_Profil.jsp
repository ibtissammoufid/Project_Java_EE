<%@ page import="Model.*"%>
<!DOCTYPE HTML>

<html>
<head>
<title>Plannerify/Profil</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />
<style>
.checked {
	color: orange;
}
</style>
</head>
<body class="subpage">

	
	<%String id_organisateur=request.getParameter("id_organisateur"); %>

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
			<li><a href="Add_Menu.jsp">Ajouter Menu</a></li>
			<li><a href="Profil_Menus.jsp">Consulter mes Menus</a></li>
			<li><a href="Afficher_Reservation_Organisateur.jsp">Consulter
					mes Réservations</a></li>
			<li><a href="Home.jsp">Se déconnecter</a></li>


		</ul>
	</nav>

	<!-- One -->
	<section id="One" class="wrapper style3">
		<div class="inner">
			<header class="align-center">
				<p>Plannerify your parties</p>
				<h2>Profil d'organisateur</h2>
			</header>
		</div>
	</section>

	<!-- Two -->
	<div id="main" class="container">

		<div class="container body-content">




			<div class="container">







				<%
					Organisateur org = new Organisateur();
					
					org = Visiter_Profil.Afficher_Info_Organisateur(id_organisateur);
				%>


				<div class="row justify-content-end" style="padding-top: 10px;">
					<h2 id="elements"><%=org.getNom_Organisateur()%></h2>



				</div>
				<div class="row justify-content-start" style="padding-top: 10px;">

					<div class="col" style="padding-top: 10px;">


						<img alt="Image html" width="90%" height="90%"
							style="max-height: 450px; max-width: 350px;"
							src="images/g.png" />


					</div>
					<div class="col" style="padding-top: 10px;">

						<div class="row justify-content-center" style="padding-top: 10px;">
							<label>Description</label>



						</div>
						<div class="row justify-content-end" style="padding-top: 10px;">
							<p class="text-black-50">
								<%=org.getDescription_Organisateur()%>
							</p>
							<br>
							<ul class="icons">
								<li><a href="#" class="icon fa-twitter"><span
										class="label">Twitter</span></a></li>
								<li><a href="#" class="icon fa-facebook"><span
										class="label">Facebook</span></a></li>
								<li><a href="#" class="icon fa-instagram"><span
										class="label">Instagram</span></a></li>
								<br>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>


							</ul>
						</div>
					</div>
				</div>


			</div>



		</div>

	</div>

	<div class="container body-content">
		<i style="font-size: 24px; color: #a300cc" class="fa">&#xf095;</i>
		<%=org.getContact_Organisateur()%><br> <i
			style="font-size: 24px; color: #a300cc" class="fa">&#xf0e0;</i>
		<%=org.getEmail_Organisateur()%><br> <i
			style="font-size: 24px; color: #a300cc" class="fa">&#xf041;</i>
		<%=org.getVille_Organisateur()%>,
		<%=org.getAdresse_Organisateur()%>


		<div class="container">




			<div class="row justify-content-start" style="padding-top: 8px;">

				<div class="col" style="padding-top: 10px;">


					<img alt="Image html" width="90%" height="90%"
						style="max-height: 450px; max-width: 350px;" src="images/20.jpg" />


				</div>
				<div class="col" style="padding-top: 10px;">


					<img alt="Image html" width="90%" height="90%"
						style="max-height: 450px; max-width: 350px;" src="images/16.jpg" />


				</div>
				<div class="col" style="padding-top: 10px;">


					<img alt="Image html" width="90%" height="90%"
						style="max-height: 450px; max-width: 350px;" src="images/17.jpg" />
					<br> <br> <br>



				</div>

			</div>
			<div class="row justify-content-start" style="padding-top: 8px;">

				<div class="col" style="padding-top: 10px;">


					<img alt="Image html" width="90%" height="90%"
						style="max-height: 450px; max-width: 350px;" src="images/17.jpg" />


				</div>
				<div class="col" style="padding-top: 10px;">


					<img alt="Image html" width="90%" height="90%"
						style="max-height: 450px; max-width: 350px;" src="images/20.jpg" />


				</div>
				<div class="col" style="padding-top: 10px;">


					<img alt="Image html" width="90%" height="90%"
						style="max-height: 450px; max-width: 350px;" src="images/16.jpg" />
					<br> <br> <br>



				</div>

			</div>



		</div>



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
		<div class="copyright">&copy; Plannerify</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>