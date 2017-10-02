<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 17. 6. 25
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html ng-app="loginPage001R1">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <script type="text/javascript" src="components/angular/angular.js"></script>
    <script type="text/javascript" src="components/angular-resource/angular-resource.js"></script>
    <script type="text/javascript" src="components/angular-mocks/angular-mocks.js"></script>
    <script type="text/javascript" src="components/angular-animate/angular-animate.js"></script>
    <script type="text/javascript" src="components/angular-ui-router/release/angular-ui-router.js"></script>

    <script type="text/javascript" src="components/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="components/requirejs/require.js"></script>

    <%--mui--%>
    <script type="text/javascript" src="components/mui/packages/cdn/js/mui.js"></script>
    <script type="text/javascript" src="components/mui/packages/cdn/angular/mui-angular.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <link rel="stylesheet" type="text/css" href="components/mui/packages/cdn/css/mui.css">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <%--//mui--%>

    <script type="text/javascript" src="js/login/loginPage001R1.js"></script>

    <title>Title</title>
</head>
<body ng-controller="loginPage001R1C1">
{{ initMessage }}
</body>
</html>
