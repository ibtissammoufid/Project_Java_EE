<!DOCTYPE HTML>

<html>
<head>
<title>PLANNERIFY/Marriage</title>

<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />



</head>
<body>
<%
	    if(session.getAttribute("email")==null){
		    response.sendRedirect("Login.jsp");
		}

	%>

	<!-- Header -->
	<header id="header" class="alt">
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
			<li><a href="Login_v2/index.html">Login</a></li>

		</ul>
	</nav>



	<!-- Two -->
	<section id="two" class="wrapper style3">
		<div class="inner">
			<header class="align-center">
				<p>ORGANIZE AND PLANNERIFY YOUR PARTY</p>
				<h2>WELCOME TO PLANNERIFY</h2>
			</header>
		</div>
	</section>



	<!-- Three -->
	<section id="three" class="wrapper style2">
		<div class="inner">

			<div class="gallerie">
				<div>
					<div class="fit">

						<a href="Menus.jsp?type=<%="Robes"%>"> <img
							style="border-color: #01BBFE;" border="30" src="images/7.jpg"
							alt="" title="Robes et Caftans " style="float: left" />
						</a> 
							<a href="Menus.jsp?type=<%="Traiteur"%>"><img
								src="images/1.jpg" alt="" title="Traiteurs"
								style="float: right" border="5" /></a>
						


					</div>

					<div>

						<div class="fit">

							<a href="Menus.jsp?type=<%="Patisserie"%>"><img
								style="border-color: #01BBFE;" src="images/4.jpg" alt=""
								title="Patisserie" border="5" /></a> 
								<a href="Menus.jsp?type=<%="Beaute"%>"><img
							src="images/5.jpg" alt="" border="5"
							title="Maquillage et chignon" style="float: right" /></a>
						</div>

						<div>
							<div class="fit">

								<a href="Menus.jsp?type=<%="Bijouterie"%>"> <img
									style="border-color: #01BBFE;" border="30"
									src="images/9.jpg" alt="" title="bijouterie "
									style="float: left" />
								</a> <a href="Menus.jsp?type=<%="Salles"%>"><img src="images/8.jpg"
									alt="" border="5" title="Salles" style="float: right" /></a>


							</div>

						</div>
						<div>
							<div class="fit">

								<a href="Menus.jsp?type=<%="Photographie"%>"> <img
									style="border-color: #01BBFE;" border="30"
									src="images/2.jpg" alt="" title="Photographe "
									style="float: left" />
								</a> <a href="Menus.jsp?type=<%="Musique"%>"><img
									src="images/3.jpg" alt="" border="5"
									title="groupe de musique" style="float: right" /></a>


							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</section>





	<!-- Footer -->
	<footer id="footer">
		<div class="container">
			<ul class="icons">
				<li><a href="https://twitter.com/" class="icon fa-twitter"><span
						class="label">Twitter</span></a></li>
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
