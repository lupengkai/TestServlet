<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Divide</title>
</head>
<body bgcolor="#ffffff">
<center>
    <h1>
        <%
            try {
                float dividend = Float.parseFloat(request.getParameter("v1"));
                float divisor = Float.parseFloat(request.getParameter("v2"));
                double result = dividend / divisor;
        %>
        <%= result%>
        <%
            } catch (Exception ex) {
                out.println("不合法的除数或被除数！");
            }
        %>

    </h1>
</center>

</body>
</html>