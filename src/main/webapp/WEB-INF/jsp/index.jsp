<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring boot</title>
</head>
<body>
<form action="/import" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="导入Excel">
</form>
</body>
</html>