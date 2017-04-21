<jsp:include page="/WEB-INF/view/Header.jsp" />

<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<link href="resources/css/adminForm.css">
<script src="resources/js/adminForm.js"></script>

<div class="container">
	<div class="col-md-5">
		<div class="form-area">
			<fm:form role="form" action="registerPartner"
				modelAttribute="partner" method="post">
				<br style="clear: both">
				<h3 style="margin-bottom: 25px; text-align: center;">Partner
					Form</h3>
				<div class="form-group">
					<fm:input type="text" path="name" class="form-control" id="name"
						name="name" placeholder="Name" required="true" />
				</div>
				<div class="form-group">
					<fm:input type="text" path="year" class="form-control" id="year"
						name="year" placeholder="Year" required="true" />
				</div>
				<div class="form-group">
					<fm:input type="text" path="role" class="form-control" id="role"
						name="role" placeholder="Role in partnership" required="true" />
				</div>
				<div class="form-group">
					<fm:input type="text" path="expertise" class="form-control"
						id="expertise" name="expertise" placeholder="Area of expertise"
						required="true" />
				</div>
				<div class="form-group">
					<fm:textarea path="about" class="form-control" type="textarea"
						id="about" placeholder="About you" maxlength="250" rows="7"></fm:textarea>
				</div>
				<input type="submit" id="submit" name="submit" value="Submit Form"
					class="btn btn-primary pull-right">
			</fm:form>
		</div>
	</div>
</div>

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
						<th colspan="2">Modify</th>
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
							<td><a href="<c:url value='/editPartner/${partner.id}'/>">Edit</a></td>
							<td><a href="<c:url value='/deletePartner/${partner.id}'/>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/view/Footer.jsp" />