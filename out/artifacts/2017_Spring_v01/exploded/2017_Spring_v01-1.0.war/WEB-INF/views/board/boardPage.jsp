<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 17. 5. 10
  Time: 오후 4:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html ng-app="boardPage">
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

    <script type="text/javascript" src="js/board/board001R1.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <title>Title</title>
</head>
<body ng-controller="boardPageCtrl">
<div id="sidedrawer" class="mui--no-user-select">
    <div id="sidedrawer-brand" class="mui--appbar-line-height">
        <span class="mui--text-title">{{ message }}</span>
    </div>
    <div class="mui-divider"></div>
    <ul>
        <li>
            <strong>Category 1</strong>
            <ul>
                <li><a href="mv_boardPage.do">게시판</a></li>
                <li><a href="#">Item 2</a></li>
                <li><a href="#">Item 3</a></li>
            </ul>
        </li>
        <li>
            <strong>Category 2</strong>
            <ul>
                <li><a href="#">Item 1</a></li>
                <li><a href="#">Item 2</a></li>
                <li><a href="#">Item 3</a></li>
            </ul>
        </li>
        <li>
            <strong>Category 3</strong>
            <ul>
                <li><a href="#">Item 1</a></li>
                <li><a href="#">Item 2</a></li>
                <li><a href="#">Item 3</a></li>
            </ul>
        </li>
    </ul>
</div>
<header id="header" class="mui-appbar mui--z1">
    <div class="mui-container">
        <table width="100%">
            <tbody>
            <tr class="mui--appbar-height">
                <td>
                    <a class="sidedrawer-toggle mui--visible-xs-inline-block mui--visible-sm-inline-block js-show-sidedrawer">☰</a>
                    <a class="sidedrawer-toggle mui--hidden-xs mui--hidden-sm js-hide-sidedrawer">☰</a>
                </td>
                <td align="right">
                    <ul class="mui-list--inline mui--text-body2">
                        <li>
                            <a href="#" style="color:#f3f3f3;">About</a>
                        </li>
                        <li>
                            <a href="#" style="color:#f3f3f3;">Login</a>
                        </li>
                    </ul>
                </td>
            </tr>
            </tbody>
        </table>
    </div>

</header><br/>
<div id="content-wrapper">
    <div class="mui--appbar-height"></div>
    <div class="mui-container-fluid">
        <div ag-grid="gridOptions" class="ag-fresh" style="height: 300px;"></div>
    </div>
    <%--{{ mainPageSc.getBoard }}--%>
</div>

<!--<footer id="footer">
    <div class="mui-container-fluid">
        <br/>
        Designed by Nick
    </div>
</footer>-->
</body>
</html>
