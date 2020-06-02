<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%-- <%@ page isELIgnored="false" %> --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to JournalDEV Tutorials</h3>
<ul>
	<li>Java 8 tutorial</li>
	<li>Spring tutorial</li>
	<li>Gradle tutorial</li>
	<li>BigData tutorial</li>
</ul>
<!-- ?logout=true -->
<c:url value="/logout" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  <h5>${pageContext.request.userPrincipal.name}</h5>
</form>
<!-- <a href="javascript:document.getElementById('logout').submit()">Logout</a> -->
<c:if test="${pageContext.request.userPrincipal.name != null}">
	<a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>


</body>
</html>