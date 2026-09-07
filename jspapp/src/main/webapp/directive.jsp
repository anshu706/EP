<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %>
<%@ page import="java.util.Random" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Directive Example</title>
</head>
<body>


    <%
        Random rd = new Random();
    %>

    <h1>Random Number is <%= rd.nextInt(1000) %></h1>

    <c:set var="marks" value="16"></c:set>

    <h2>Marks: <c:out value="${marks}"></c:out></h2>

    <h2>Name: <c:out value="Ansh"></c:out></h2>

    <c:if test="${marks > 15}">
        <h2>Congratulations! You Passed.</h2>
    </c:if>

    <c:if test="${marks <= 15}">
        <h2>Sorry! You Failed.</h2>
    </c:if>


</body>
</html>