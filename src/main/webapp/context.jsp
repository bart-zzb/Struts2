<%--
  Created by IntelliJ IDEA.
  User: bartz
  Date: 2024/7/4
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 获取context里面数据, 写ognl时候, 首先添加符号
        #context的key名称, 域对象名称--%>
    <s:property value="#request.req"/>

    <%-- 使用%, 才能让struts识别ognl表达式 --%>
    <s:textfield name="username" value="%{#request.req}"></s:textfield>
</body>
</html>
