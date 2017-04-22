<jsp:include page="/WEB-INF/view/Header.jsp" />

<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<link
	href="${pageContext.request.contextPath}/resources/css/adminForm.css">
<script
	src="${pageContext.request.contextPath}/resources/js/adminForm.js"></script>

<div class="container">
	<div class="col-md-5">
		<div class="form-area">
			<fm:form role="form"
				action="${pageContext.request.contextPath}/registerAssociate"
				modelAttribute="associate" method="post">
				<br style="clear: both">
				<h3 style="margin-bottom: 25px; text-align: center;">Associate
					Form</h3>
				<c:if test="${not empty associate.name}">
					<div class="form-group">
						<fm:input type="text" path="id" class="form-control" id="id"
							name="id" placeholder="Id" readonly="true" />
					</div>
				</c:if>
				<div class="form-group">
					<fm:input type="text" path="name" class="form-control" id="name"
						name="name" placeholder="Name" required="true" />
				</div>
				<div class="form-group">
					<fm:input type="text" path="company" class="form-control"
						id="company" name="company" placeholder="company" required="true" />
				</div>
				<div class="form-group">
					<fm:input type="text" path="companyname" class="form-control"
						id="companyname" name="companyname" placeholder="companyname"
						required="true" />
				</div>
				<input type="submit" id="submit" name="submit" value="Submit Form"
					class="btn btn-primary pull-right">
			</fm:form>
		</div>
	</div>
</div>

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
						<th colspan="2">Modify</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="associate" items="${associateList}">
						<tr>
							<td>${associate.id}</td>
							<td>${associate.name}</td>
							<td>${associate.company}</td>
							<td>${associate.companyname}</td>
							<td><a
								href="<c:url value='/editAssociate/${associate.id}'/>">Edit</a></td>
							<td><a
								href="<c:url value='/deleteAssociate/${associate.id}'/>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/view/Footer.jsp" />