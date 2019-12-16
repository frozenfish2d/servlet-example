<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%

    String name;

    Object nameObject = request.getAttribute("name");
    if (nameObject != null) {
        name = (String) nameObject;
    } else {
        name = "";
    }

    if (name.isEmpty()) {
%>

<form action="servlet7" method="POST">
    First Name: <input type="text" name="name">
    <input type="submit" value="Submit"/>
</form>

<% } else { %>
<h1>Name = ${name}</h1>
<% } %>
</body>
</html>
