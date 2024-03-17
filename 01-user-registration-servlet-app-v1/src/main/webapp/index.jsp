<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form action="register">
    First Name:
    <input type="text" name="firstName">
    <br>
    Last Name:
    <input type="text" name="lastName">
    <br>
    Age:
    <input type="number" name="age">
    <br>
    Programming
    <input type="checkbox" name="hobby" value="programming">
    <br>
    Gaming
    <input type="checkbox" name="hobby" value="gaming">
    <br>
    Cooking
    <input type="checkbox" name="hobby" value="cooking">
    <br>
    <br>
    <input type="submit" value="send">
</form>
</body>
</html>
