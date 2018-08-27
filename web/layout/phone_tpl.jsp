<%@ taglib prefix="stiemech" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="sitemech" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title><stiemech:title/></title>
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/dashboard.css" rel="stylesheet">
</head>

<body>
    <%@include file="phone_top.jsp"%>

<div class="container-fluid">
    <div class="row">

        <%@include file="phone_mamu.jsp"%>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h2>手机详情</h2>
            <div class="table-responsive">
                <sitemech:body></sitemech:body>
            </div>
        </main>
    </div>
</div>

<!-- Icons -->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace()
</script>

</body>
</html>
