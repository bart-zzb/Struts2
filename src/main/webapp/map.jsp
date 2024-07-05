<%--
  Created by IntelliJ IDEA.
  User: bartz
  Date: 2024/7/4
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/map.action" method="post">
        <%-- 设置key值map['key值'] --%>
        username:<input type="text" name="map['one'].username"/>
        <br/>
        password:<input type="text" name="map['one'].password"/>
        <br/>
        address:<input type="text" name="map['one'].address"/>
        <br/>

        username:<input type="text" name="map['two'].username"/>
        <br/>
        password:<input type="text" name="map['two'].password"/>
        <br/>
        address:<input type="text" name="map['two'].address"/>
        <br/>

        <input type="submit" value="提交"/>
    </form>
</body>
</html>
