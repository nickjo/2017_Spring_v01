<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 17. 8. 15
  Time: 오후 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="joinApp">
<head>
    <script type="text/javascript" src="js/join/joinPage.js"></script>
</head>
<body ng-controller="joinPageCtrl">
<form class="mui-form" name="frm" id="frm">
    <legend>{{ title }}</legend>
    <div class="mui-textfield mui-textfield--float-label" style="width:60%;">
        <input type="text" id="userName" name="userName" ng-model="name" required>
        <label>Member Name</label>
    </div>
    <div class="mui-textfield mui-textfield--float-label" style="width:60%;">
        <input type="email" id="userEmail" name="userEmail" ng-model="email" required>
        <label>Email Address</label>
    </div>
    <div class="mui-textfield" style="width:60%;">
        <input type="password" id="userPw" name="userPw" ng-model="textPw" required>
        <label>Password</label>
    </div>
    <%--<div class="mui-textfield mui-textfield--float-label" style="width:60%;">
        <textarea required></textarea>
        <label>Required Textarea</label>
    </div>--%>
    <%--<div class="mui-textfield mui-textfield--float-label"  style="width:60%;">
        <input type="email" value="Validation error">
        <label>Email Address</label>
    </div>--%>
    <button type="submit" class="mui-btn mui-btn--raised mui-btn--primary" ng-click="subMemInfo()">Submit</button>
</form>
</body>
</html>
