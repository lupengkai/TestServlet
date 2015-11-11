<%-- ******RequestBean****** --%>
<jsp:useBean id="counterBean" class="bean.CounterBean" scope="request"/>

<jsp:setProperty name="counterBean" property="count" value="100"/>

<jsp:forward page="RequestBean2.jsp"/>


