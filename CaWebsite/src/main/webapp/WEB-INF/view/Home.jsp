<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<%@page isELIgnored="false"%>

<jsp:include page="Header.jsp" />

<br>

<c:if test="${LoginClicked==true}">
	<jsp:include page="login.jsp"></jsp:include>
</c:if>

<jsp:include page="carousal.jsp"></jsp:include>
<br>
<jsp:include page="carousal2.jsp"></jsp:include>
<br>
<jsp:include page="Footer.jsp" />
