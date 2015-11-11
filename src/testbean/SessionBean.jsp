<%-- ******SessionBean****** --%>
<jsp:useBean id="counterBean" class="bean.CounterBean" scope="session"/>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SessionBean</title>
</head>
<body>
<h3>CounterBean scope="session" Example</h3>
<b>count: </b>
<jsp:getProperty name="counterBean" property="count"/>
</body>
</html>

