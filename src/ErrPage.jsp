<%--******ErrPage.jsp******--%>
<%@page contentType="text/html; charset=gb2312" %>
<%@page isErrorPage="true" %>
<html>
<body text="red">
������Ϣ�� <%= exception.getMessage() %>
</body>
</html>