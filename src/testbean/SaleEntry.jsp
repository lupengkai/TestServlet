<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Using jsp:setProperty</title>
</head>
<body>
<table border="5" align="center">
    <tr>
        <th>Using jsp:setProperty</th>
    </tr>
</table>
<jsp:useBean id="entry" class="bean.SaleEntry"/>

<jsp:setProperty name="entry" property="itemID" value='<%=request.getParameter("itemID")%>'/>

<jsp:setProperty name="entry" property="numItems" param="numItems"/>

<jsp:setProperty name="entry" property="discountCode" param="discountCode"/>

<br>

<table align="center" border="1">
    <tr>
        <th>Item ID</th>
        <th>Unit Price</th>
        <th>Number of Ordered</th>
        <th>Total Price</th>
    </tr>
    <tr align="center">
        <td>
            <jsp:getProperty name="entry" property="itemID"/>
        </td>
        <td>
            <jsp:getProperty name="entry" property="itemCost"/>
        </td>
        <td>
            <jsp:getProperty name="entry" property="numItems"/>
        </td>
        <td>
            <jsp:getProperty name="entry" property="totalCost"/>
        </td>
    </tr>
</table>
</body>
</html>