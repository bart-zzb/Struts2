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

    <!--2获取值栈对象的值-->
    <br/>
    <s:property value="user.username"/>
    <s:property value="user.password"/>
    <s:property value="user.address"/>

    <!--3获取值栈list集合数据-->
    <!-- 第一种方式实现 -->
    <br/>
    <s:property value="list[0].username"/>
    <s:property value="list[0].password"/>
    <s:property value="list[0].address"/>

    <!-- 第二种方式 遍历值栈中list集合-->
    <br/>
    <s:iterator value="list">
        <s:property value="username"/>
        <s:property value="password"/>
        <s:property value="address"/>
    </s:iterator>

    <!-- 第三种方式 遍历值栈中list集合-->
    <br/>
    <s:iterator value="list" var="user">
        <%--  遍历值栈list集合,得到每个user对象
               机制：把每次遍历出来的user对象放到context中
               获取context里面数据特点,写ognl表达式
               使用特殊符号 #--%>
        <s:property value="#user.username"/>
        <s:property value="#user.password"/>
        <s:property value="#user.address"/>
    </s:iterator>
</body>
</html>
