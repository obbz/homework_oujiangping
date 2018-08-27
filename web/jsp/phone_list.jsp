<%@ page import="com.nf.phone.entity.Phone" %>
<%@ page import="java.util.List" %>
<%@ page import="util.WebUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机</title>
</head>
<body>

<%= WebUtil.popSessionMsg(request) %>
<form id="myform" action="/phone/del" method="post">
    <table class="table table-striped">
        <tr>
            <th>选项</th>
            <th>id</th>
            <th>手机品牌</th>
            <th>手机型号</th>
            <th>手机价格</th>
            <th>存储容量</th>
            <th>操作</th>
        </tr>
        <%
            List<Phone> phones = (List<Phone>) request.getAttribute("phones");
            for (Phone phone : phones) {
        %>
        <tr>
            <td><input name="id" value="<%= phone.getId()%>" type="checkbox"></td>

            <td><%= phone.getId() %>
            </td>
            <td><a href="/phone/detail?id=<%= phone.getId()%>"><%= phone.getBrand() %>

            <td><%= phone.getName() %>
            </td>
            <td><%= phone.getPrice()%>
            </td>
            <td><%= phone.getSc()%>
            </td>
            <td>
                <a href="/phone/del?id=<%= phone.getId() %>">删除</a>
                <a data-toggle="modal" href="/phone/update?id=<%=phone.getId()%>" data-id="<%= phone.getId()%>">更新</a>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <div style="margin-top: 2em;">
        <input type="submit" value="删除" class="btn btn-success">
        <a class="btn btn-primary" href="/phone/add">增加新的手机信息</a>
        <%--<a class="btn btn-primary" href="#myModal2">增加新的书籍</a>--%>
    </div>
</form>

</body>
</html>
