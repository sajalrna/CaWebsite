<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Header.jsp" />
<h4>
	<b>&nbsp;&nbsp;&nbsp;LIST OF ALL THE ASSOCIATES IN THE DATABASE:</b>
</h4>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-9">
			<table class="table table-list-search">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Company</th>
						<th>Company Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="associate" items="${associateList}">
						<tr>
							<td>${associate.id}</td>
							<td>${associate.name}</td>
							<td>${associate.company}</td>
							<td>${associate.companyname}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<jsp:include page="Footer.jsp" />