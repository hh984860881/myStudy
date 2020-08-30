<%--
  Created by IntelliJ IDEA.
  User: Huang Hang
  Date: 2020/8/28
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考试在线管理系统登陆</title>
    <link rel="stylecss" type="text/css" href="styleCss.css">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="login-box">

    <form  class="login-form" action="./jQuery.html" method="POST">

        <h1>Welcome</h1>
        <input class="txtb" type="text" name="" placeholder="Username">
        <input class="txtb" type="password" name="" placeholder="password">
        <input type="radio" name="juese" class="login_radio" value="student" checked="checked">学生
        <input type="radio" name="juese" class="login_radio" value="teacher">老师
        <input type="radio" name="juese" class="login_radio" value="admin">管理员<br>
        <input class="login-btn" type="submit" name="" value="登陆">
        <input class="login_btn2" type="button"  value="注册">
    </form>
</div>
</body>
</html>
