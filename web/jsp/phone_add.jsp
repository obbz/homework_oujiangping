<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加手机信息</title>
    <meta name="subtitle" content="新增手机信息">
</head>
<body>

<form action="/phone/add" method="post">
    <div class="modal fade" id="myModal2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">

    <div class="form-group">
        <label for="id">手机ID</label>
        <input type="number" class="form-control" id="id" name="id" placeholder="id">
    </div>
    <div class="form-group">
        <label for="brand">手机品牌</label>
        <input type="text" class="form-control" id="brand" name="brand" placeholder="brand">
    </div>
        <div class="form-group">
            <label for="name">手机型号</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="name">
        </div>
    <div class="form-group">
        <label for="price">书籍价格</label>
        <input type="number" class="form-control" id="price" name="price" placeholder="price">
    </div>
    <div class="form-group">
        <label for="sc">存储容量</label>
        <input type="text" class="form-control" id="sc" name="sc" placeholder="sc">
    </div>
    <div><input type="submit" class="form-control"></div>
    </div>
</form>

<script>
    document.querySelector("#phoneadd").classList.add("active");
</script>

</body>
</html>
