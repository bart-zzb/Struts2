<%--
  Created by IntelliJ IDEA.
  User: bartz
  Date: 2024/7/4
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!-- 使用struts2标签查看值栈结构 -->
    <s:debug></s:debug>

    <!-- 1获取字符串值 -->
    <s:property value="name"/>
</body>
</html>
