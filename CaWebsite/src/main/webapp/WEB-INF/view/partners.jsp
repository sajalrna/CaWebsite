<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Header.jsp" />
<h4>
	<b>&nbsp;&nbsp;&nbsp;LIST OF ALL THE PARTNERS IN THE DATABASE:</b>
</h4>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-9">
			<table class="table table-list-search">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>About You</th>
						<th>year</th>
						<th>Role</th>
						<th>Expertise</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="partner" items="${partnerList}">
						<tr>
							<td>${partner.id}</td>
							<td>${partner.name}</td>
							<td>${partner.about}</td>
							<td>${partner.year}</td>
							<td>${partner.role}</td>
							<td>${partner.expertise}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<jsp:include page="Footer.jsp" />