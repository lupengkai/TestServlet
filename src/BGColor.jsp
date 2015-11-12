<html>
<head>
    <title>
        Color Testing
    </title>
</head>

<!--
html注释
-->

<%--
注释1
--%>

<%
    //注释2
/*
注释3
*/
    String bgColor = request.getParameter("bgColor");
    boolean hasExplicitColor;
    if (bgColor != null) {
        hasExplicitColor = true;
    } else {
        hasExplicitColor = false;
        bgColor = "WHITE";
    }
%>

<body bgcolor="<%= bgColor %>">

</body>


</html>
