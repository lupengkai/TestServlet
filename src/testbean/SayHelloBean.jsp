<%@page language="java" import="bean.*" %>
<%@page contentType="text/html; charset=gb2312" %>

<%
    request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="hello" class="bean.HelloBean" scope="request"/>
<jsp:setProperty name="hello" property="*"/>

<html>
<head>
    <title>HelloBean</title>
    <meta http-equiv="CONTENT-TYPE" content="text/html;charset=gb2312">
</head>
<body bgcolor="#ffffff">
<p>&nbsp;</p>

<p align="center">
    <font size="4">欢迎</font>
    <%--<font  color="#0000ff">
        <b>
            <%= new String(hello.getName().getBytes("ISO8859_1"),"GBK")%>
            <%= new String(hello.getSex().getBytes("ISO8859_1"),"GBK")%>
        </b>
    </font>--%>
    <jsp:getProperty name="hello" property="name"/>
    <jsp:getProperty name="hello" property="sex"/>

</p>
</body>
</html>