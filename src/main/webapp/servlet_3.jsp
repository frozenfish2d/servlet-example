<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%! private int accessCount = 0; %>
Количество обращений к странице с момента загрузки сервера:
<%= ++accessCount %>

</body>
</html>
