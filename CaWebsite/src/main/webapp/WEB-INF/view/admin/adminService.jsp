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
				action="${pageContext.request.contextPath}/registerService"
				modelAttribute="service" method="post">
				<br style="clear: both">
				<h3 style="margin-bottom: 25px; text-align: center;">Service
					Form</h3>
				<c:if test="${not empty service.name}">
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
					<fm:input type="text" path="details" class="form-control" id="details"
						name="details" placeholder="Details" required="true" />
				</div>
				<input type="submit" id="submit" name="submit" value="Submit Form"
					class="btn btn-primary pull-right">
			</fm:form>
		</div>
	</div>
</div>

<h4>
	<b>&nbsp;&nbsp;&nbsp;LIST OF ALL THE SERVICES IN THE DATABASE:</b>
</h4>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-9">
			<table class="table table-list-search">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Details</th>
						<th colspan="2">Modify</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="service" items="${serviceList}">
						<tr>
							<td>${service.id}</td>
							<td>${service.name}</td>
							<td>${service.details}</td>
							<td><a href="<c:url value='/editService/${service.id}'/>">Edit</a></td>
							<td><a href="<c:url value='/deleteService/${service.id}'/>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/view/Footer.jsp" />