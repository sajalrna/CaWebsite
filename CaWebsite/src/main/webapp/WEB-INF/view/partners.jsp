<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Header.jsp" />
<link href="resources/css/partner.css" rel="stylesheet">
<c:forEach var="partner" items="${partnerList}">
	<div class="container content">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="testimonials">
					<div class="active item">

						<div class="carousel-info">
							<img alt=""
								src="http://keenthemes.com/assets/bootsnipp/img1-small.jpg"
								class="pull-left">
							<div class="pull-left">
								<span class="testimonials-name">${partner.name}&nbsp&nbsp(${partner.year})</span>
								<span class="testimonials-post">${partner.role}</span>
							</div>
						</div>
						<blockquote>
							<p>${partner.expertise}</p>
							<p>${partner.about}</p>
						</blockquote>
					</div>
				</div>
			</div>
		</div>
	</div>
</c:forEach>
<jsp:include page="Footer.jsp" />