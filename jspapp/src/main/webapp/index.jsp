<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet tags</title>
</head>
<body>

<h1>Hello World</h1>

<!-- SCRIPTING ELEMENT ( Allows to write java code inside j_sp file ) -->

<!-- 1. Declaration tag -->
<%!
    int a = 10;
    int b = 24;
    String name = "ansh";

    public int doSum() {
        return a + b;
    }
%>

<!-- 2. Script_let tag -->
<%
%>

<h1>The sum of a+b is <% out.print(doSum()); %></h1>

<!--  3. expression tag -->
<%= doSum() %>

</body>
</html>