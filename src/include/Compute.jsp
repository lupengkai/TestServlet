<%@page language="java" %>

<%
    String value1 = request.getParameter("value1");
    String value2 = request.getParameter("value2");

    if (request.getParameter("compute").equals("division")) {
%>
<jsp:include page="Divide.jsp" flush="true">
    <jsp:param name="v1" value="<%= value1 %>"></jsp:param>
    <jsp:param name="v2" value="<%= value2 %>"></jsp:param>
</jsp:include>
<%
} else {
%>
<%@include file="Multiply.jsp" %>
<%
    }
%>