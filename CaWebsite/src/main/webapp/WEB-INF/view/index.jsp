<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<style>
@import
	url(http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css)
	;

.bg-lightgray {
	background-color: LightGray;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp" />

	<h2>welcome to ca website</h2>

	<a href="home">home page</a>
	<br>
	<a href="partners">partners</a>
	<br>
	<a href="associates">associates</a>
	<br>services
	<br>notifications
	<br>acts
	<br>rules
	<br>
	<br>query
	<br>contact
	<br>login
	<br>
	<jsp:include page="login.jsp"></jsp:include>
	<jsp:include page="carousal.jsp"></jsp:include>

	<hr>
	<jsp:include page="carousal2.jsp"></jsp:include>
	<hr>
	<footer class="container-fluid text-center bg-lightgray">

		<div class="copyrights" style="margin-top: 25px;">
			<p>
				Sajal Gupta © 2017, All Rights Reserved <br>
			<p>
				<a href="https://www.linkedin.com/in/sajalrna" target="_blank">Linkedin <i
					class="fa fa-linkedin-square" aria-hidden="true"></i> 
				</a>
			</p>
		</div>
	</footer>

</body>
</html>
