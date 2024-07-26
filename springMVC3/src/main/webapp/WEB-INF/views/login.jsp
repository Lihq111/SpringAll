<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>登录成功</h1>
msg:<h1>${requestScope.msg}</h1>
user:<h1>${requestScope.user}</h1>
admin:<h1>${requestScope.admin}</h1>
other:<h1>${sessionScope.other}</h1>
session:<h1>${sessionScope.other}</h1>
name:<h1>${requestScope.dept.deptName}</h1>
</body>
</html>
   