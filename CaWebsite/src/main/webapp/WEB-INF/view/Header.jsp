<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<%@page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CA Website</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link href="resources/css/login.css" type="stylesheet">
<script src="resources/js/login.js"></script>
<link href='http://fonts.googleapis.com/css?family=Varela+Round'
	rel='stylesheet' type='text/css'>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />

<link href="resources/css/Header.css" type="stylesheet">
</head>
<body>
	<h2>WELCOME TO CA WEBSITE</h2>

	<div class="container-fluid">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#example-2"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar top-bar"></span> <span
							class="icon-bar middle-bar"></span> <span
							class="icon-bar bottom-bar"></span>
					</button>
					<!-- <a class="navbar-brand" href="#">Example #2 Brand</a>  -->
				</div>
				<div class="collapse navbar-collapse" id="example-2">
					<ul class="nav navbar-nav">
						<li><a href="home">Home</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Our Team<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="partners">Partners</a></li>
								<li><a href="associates">Associates</a></li>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Our Services<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Service 1</a></li>
								<li><a href="#">Service 2</a></li>
							</ul></li>
						<li><a href="#">Notifications</a></li>
						<li><a href="#">Acts</a></li>
						<li><a href="#">Rules</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">Query</a></li>
						<li><a href="#">Contact Us</a></li>
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/login"
							class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false">My Account<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<s:authorize access="isAnonymous()">
									<li><a href="${pageContext.request.contextPath}/login">Login
											<i class="fa fa-sign-in" aria-hidden="true"></i>
									</a></li>
									<li><a href="${pageContext.request.contextPath}/register">Register
											<i class="fa fa-user-plus" aria-hidden="true"></i>
									</a></li>
								</s:authorize>
								<s:authorize access="isAuthenticated()">
									<li><a href="${pageContext.request.contextPath}/logout">Logout
											<i class="fa fa-sign-out" aria-hidden="true"></i>
									</a></li>
								</s:authorize>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>