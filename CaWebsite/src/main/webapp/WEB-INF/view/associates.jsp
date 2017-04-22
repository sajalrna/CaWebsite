<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Header.jsp" />

<c:forEach var="associate" items="${associateList}">

	<div class="container">
		<div class="jumbotron">
			<div class="row">
				<div class="col-md-4 col-xs-12 col-sm-6 col-lg-4">
					<img
						src="https://www.svgimages.com/svg-image/s5/man-passportsize-silhouette-icon-256x256.png"
						alt="stack photo" class="img">
				</div>
				<div class="col-md-8 col-xs-12 col-sm-6 col-lg-8">
					<div class="container" style="border-bottom: 1px solid black">
						<h2>${associate.name}</h2>
					</div>
					<hr>
					<ul class="container details">
						<li><p>
								<span class="glyphicon glyphicon-envelope one"
									style="width: 50px;"></span>somerandom@email.com
							</p></li>
						<li><p>
								<span class="glyphicon glyphicon-map-marker one"
									style="width: 50px;"></span>${associate.company}
							</p></li>
						<li><p>
								<span class="glyphicon glyphicon-new-window one"
									style="width: 50px;"></span>${associate.companyname}
							</p>
					</ul>
				</div>
			</div>
		</div>
	</div>

</c:forEach>

<jsp:include page="Footer.jsp" />