<html>
<head>
    <title>
        JSP Declarations
    </title>
</head>

<body>
<h1>JSP Declarations</h1>

<%!
    int accessCount = 0;//全局变量
%>

<%
    int accessCount2 = 0;
%>

<h2>
    Accesses to page since server reboot: <%= ++accessCount %> <br>
    Accesses to page since server reboot: <%= ++accessCount2 %>
</h2>
</body>
</html>