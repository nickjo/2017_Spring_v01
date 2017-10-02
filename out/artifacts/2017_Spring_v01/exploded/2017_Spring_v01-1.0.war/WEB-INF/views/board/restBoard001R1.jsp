<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 17. 6. 18
  Time: 오후 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="restBoard001R1">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <%--angularjs--%>
    <script type="text/javascript" src="components/angular/angular.js"></script>
    <script type="text/javascript" src="components/angular-resource/angular-resource.js"></script>
    <script type="text/javascript" src="components/angular-mocks/angular-mocks.js"></script>
    <script type="text/javascript" src="components/angular-animate/angular-animate.js"></script>
    <script type="text/javascript" src="components/angular-ui-router/release/angular-ui-router.js"></script>
    <%--//angularjs--%>

    <%--agGrid--%>
    <script type="text/javascript" src="components/ag-grid/dist/ag-grid.js"></script>
    <link rel="stylesheet" type="text/css" href="components/ag-grid/dist/styles/ag-grid.css">
    <link rel="stylesheet" type="text/css" href="components/ag-grid/dist/styles/theme-fresh.css">
    <%--//agGrid--%>

    <%--mui--%>
    <script type="text/javascript" src="components/mui/packages/cdn/js/mui.js"></script>
    <script type="text/javascript" src="components/mui/packages/cdn/angular/mui-angular.js"></script>
    <link rel="stylesheet" type="text/css" href="components/mui/packages/cdn/css/mui.css">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <%--//mui--%>

    <script type="text/javascript" src="components/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="components/requirejs/require.js"></script>

    <script type="text/javascript" src="js/board/restBoard001R1.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <title>Title</title>
</head>
<body ng-controller="restBoard001R1C1">
<div>
    {{ initMessage }}
</div>
</body>
</html>
