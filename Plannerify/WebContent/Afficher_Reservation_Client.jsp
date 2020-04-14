
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="Model.*"%>

<!DOCTYPE HTML>
<!--
	Hielo by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Plannerify/Mes réservations</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="subpage">
	<%
	    if(session.getAttribute("email")==null){
		    response.sendRedirect("Login.jsp");
		}

	%>
		<%String email_client=(String)session.getAttribute("email");  //recuperer l'email du client

%>

		<!-- Header -->
			<header id="header">
				<div class="logo"><a href="index.html">Planner<span>ify</span></a></div>
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
						<p>ORGANIZE AND PLANNERIFY YOUR PARTY</p>
				<h2>WELCOME TO PLANNERIFY</h2>
					</header>
				</div>
			</section>

		<!-- Two -->
			<section id="two" class="wrapper style2">
				<div class="inner">
				<%! List<ReservationBD> premiereListe; %>
		<%premiereListe= Afficher_Reservation_Client.Afficher(email_client); %>
		<%for(ReservationBD str:premiereListe){ %>
	
		
 <div class="container body-content">
        



<div class="container">


                    <div class="row justify-content-center" style="padding-top:10px;">
<h1></h1>


                </div>
                <div class="row justify-content-start" style="padding-top:10px;">
<label>Date Evenement :    <%= str.getDate_Evenement() %></label>



                </div>
                <div class="row justify-content-start" style="padding-top:10px;">
<label>Date Rendez_vous :   <%= str.getDate_RDV() %></label>



                </div>
                <div class="row justify-content-start" style="padding-top:10px;">
<label>Date Réservation :</label>



                </div>
                <div class="row justify-content-start" style="padding-top:10px;">
<label>Détail Client :</label>



                </div>
                <div class="row justify-content-start" style="padding-top:10px;">
<p class="text-black-50">
    <%= str.getDetail_Client() %>
</p>
                </div>
                    <div class="row justify-content-start" style="padding-top:10px;">
<label>Détail Organisateur :</label>



                </div>
                <div class="row justify-content-start" style="padding-top:10px;">
<p class="text-black-50">
    <%= str.getDetail_Organisateur() %>
</p>
                </div>
                
                
                

___________________________________________
<% } %>
</div>
				
				</div>	
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="container">
					<ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
					</ul>
				</div>
				<div class="copyright">
					&copy; Untitled. All rights reserved.
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>