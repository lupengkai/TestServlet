<%-- ******ApplicationBean****** --%>

<jsp:useBean id="counterBean" class="bean.CounterBean" scope="application"/>

<html>
<body>
<h3>CounterBean scope="application" Example</h3>
<b>count: </b>
<jsp:getProperty name="counterBean" property="count"/>
</body>
</html>
