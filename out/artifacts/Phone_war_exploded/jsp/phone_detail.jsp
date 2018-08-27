<%@ page import="util.WebUtil" %>
<%@ page import="com.nf.phone.entity.Phone" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍详情</title>
    <style>
        .msg {
            font-size: 2em;
            color: greenyellow;
        }
    </style>
</head>
<body>

<%
    Phone phone = (Phone) request.getAttribute("Phone");
%>

<%= WebUtil.popSessionMsg(request) %>

<h1><%=phone.getName()%></h1>
<ul class="list-group">
    <li class="list-group-item"><%=phone.getBrand()%></li>
    <li class="list-group-item"><%=phone.getName()%></li>
    <li class="list-group-item"><%=phone.getPrice()%></li>
    <li class="list-group-item"><%=phone.getSc()%></li>
</ul>
<a href="/phone/index">返回主页面</a>
</body>
</html>
