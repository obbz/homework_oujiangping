<%@ page import="com.nf.phone.entity.Phone" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机修改表单</title>
</head>
<body>

<% Phone phone = (Phone) request.getAttribute("phone"); %>

<form action="/phone/update" method="post">
    <div><input type="text" name="brand" placeholder="brand" value="<%= phone.getBrand()%>"></div>
    <div><input type="text" name="name" placeholder="name" value="<%= phone.getName()%>"></div>
    <div><input type="number" step="0.01" name="price" placeholder="price" value="<%= phone.getPrice()%>"></div>
    <div><input type="text" name="sc" placeholder="sc" value="<%= phone.getSc()%>"></div>
    <div><input type="hidden" name="id" value="<%= phone.getId()%>"></div>
    <div><input type="submit" value="提交更新"></div>
</form>

</body>
</html>
