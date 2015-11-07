<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Multiply</title>
</head>
<body bgcolor="#ffffff">
<center>
    <h1>
        <%
            try {
                float multiplicand = Float.parseFloat(request.getParameter("value1"));
                float multiplicator = Float.parseFloat(request.getParameter("value2"));
                double result = multiplicand * multiplicator;
                out.println(multiplicand + "*" + multiplicator + "=" + result);

            } catch (Exception ex) {
                out.println("不合法的被乘数或乘数！");
            }
        %>
    </h1>
</center>

</body>
</html>