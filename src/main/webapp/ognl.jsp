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
<%-- 使用ognl+struts2标签实现计算字符串长度 value属性值：ognl表达式  --%>
<s:property value="'haha'.length()"/>
</body>
</html>
