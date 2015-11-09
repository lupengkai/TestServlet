<%@page import="bean.*" %>

<jsp:useBean id="cb" class="bean.CounterBean"></jsp:useBean>
<jsp:setProperty name="cb" property="count" value="20"/>
<jsp:getProperty name="cb" property="count"/>