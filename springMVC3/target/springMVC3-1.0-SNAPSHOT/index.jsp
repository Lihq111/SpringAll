<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello World!</h1>

<form action="${pageContext.request.contextPath}/index/param1" method="post">
    员工id: <label for="id"></label><input type="text" id="id" name="id"><br>
    员工姓名:<label for="name"></label><input type="text" id="name" name="name"><br>
    员工邮箱: <label for="email"></label><input type="text" id="email" name="email"><br>
    员工部门: <label for="deptName"></label><input type="text" id="deptName" name="dept.name"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
   