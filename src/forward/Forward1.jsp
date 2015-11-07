<jsp:forward page="Forforward1.jsp">
    <jsp:param name="name" value="m"></jsp:param>
    <jsp:param name="oldName" value='<%= request.getParameter("name")%>'></jsp:param>
    <jsp:param name="roles" value="manager"></jsp:param>
</jsp:forward>