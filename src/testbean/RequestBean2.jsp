<%-- ******RequestBean****** --%>
<jsp:useBean id="counterBean" class="bean.CounterBean" scope="session"/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<h3>CounterBean scope="request" Example</h3>
<b>count: </b>
<jsp:getProperty name="counterBean" property="count"/>
</body>
</html>

