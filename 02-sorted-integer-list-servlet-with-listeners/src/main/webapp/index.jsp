<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Liczby</title>
</head>
<body>
<h2>Lista liczb:</h2>
<%-- Wyświetlenie listy liczb --%>
<ul>
  <% List<Integer> numbers = (List<Integer>) application.getAttribute("numbers");
    if (numbers != null) {
      for (Integer number : numbers) {
  %>
  <li><%= number %></li>
  <%
      }
    }
  %>
</ul>
<form action="RandomNumberServlet" method="get">
  <input type="submit" value="Dodaj losową liczbę">
</form>
</body>
</html>
