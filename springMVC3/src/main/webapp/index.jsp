<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>Hello World!</h1>
<form action="${pageContext.request.contextPath}/index/login111" method="post">
    <label>
        用户名：
        <input type="text" name="hello">
    </label><br>
    <input type="submit" value="登录">
</form>

<form id="employeeForm" action="${pageContext.request.contextPath}/index/param1" method="post">
    员工id: <label for="id"></label><input type="text" id="id" name="id"><br>
    员工姓名:<label for="name"></label><input type="text" id="name" name="name"><br>
    员工邮箱: <label for="email"></label><input type="text" id="email" name="email"><br>
    部门id: <label for="deptNo"></label><input type="text" id="deptNo" name="dept.deptNo"><br>
    员工部门: <label for="deptName"></label><input type="text" id="deptName" name="dept.deptName"><br>
    <input type="submit" value="提交">
</form>

<form action="index/param2" method="post">
    <label>
        <input type="checkbox" name="ids" value="1">
    </label><br>
    <label>
        <input type="checkbox" name="ids" value="2">
    </label><br>
    <label>
        <input type="checkbox" name="ids" value="3">
    </label><br>
    <input type="submit" value="提交">
</form>
<input type="button" onclick="testParam5()" value="测试List<Object>参数">
<script type="text/javascript">
    function testParam6() {
        const nameList = ["张三", "李四", "王五"];
        $.ajax({
            url: "${pageContext.request.contextPath}/index/param6",
            type: "post",
            data: JSON.stringify(
                nameList
            ),
            contentType: "application/json;charset=UTF-8",
            success: function (data) {
                alert(data);
            }
        });
    }
</script>


<script type="text/javascript">
    function testParam5() {
        const empList = [];
        empList.push({
            "id": "1",
            "name": "张三",
            "email": "zhangsan@163.com",
            "dept": {
                "deptNo": "1001",
                "deptName": "开发部"
            }
        });
        empList.push({
            "id": "2",
            "name": "张2",
            "email": "zhangsan@163.com",
            "dept": {
                "deptNo": "1002",
                "deptName": "技术部"
            }
        });
        $.ajax({
            url: "${pageContext.request.contextPath}/index/param5",
            type: "post",
            data: JSON.stringify(
                empList
            ),
            contentType: "application/json;charset=UTF-8",
            success: function () {
                alert("成功！");
            }
        });
    }
</script>
</body>
</html>
   