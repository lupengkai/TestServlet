<%-- ******PageBean****** --%>

<jsp:useBean id="counteBean" scope="page" class="bean.CounterBean"/>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>PageBean</title>
</head>
<body>
<h3> CounterBean scope="page" Example</h3>
<b>count: </b>
<jsp:getProperty name="counteBean" property="count"/>
</body>
</html>