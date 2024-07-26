<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: LHQ
  Date: 2024/7/26
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        function validateForm(event) {
            const fileInput = document.getElementsByName("file")[0];
            if (fileInput.files.length === 0) {
                alert("Error: No file selected");
                event.preventDefault(); // 阻止表单提交
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<form method="post" action="<c:url value="/upload2"/>" enctype="multipart/form-data"
      onsubmit="return validateForm(env)">
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>
<form method="post" action="<c:url value="/upload1"/>" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="file" name="file">
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>


</body>

</html>
