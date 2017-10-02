<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 17. 8. 12
  Time: 오후 5:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Head Page</title>
</head>
<body>
<header id="header" class="mui-appbar mui--z1">
<div class="mui-container">
    <table width="100%">
        <tbody>
        <tr class="mui--appbar-height">
            <td align="right">
                <ul class="mui-list--inline mui--text-body2">
                    <li>
                        <a href="mv_joinPage.do" style="color:#f3f3f3;">Join</a>
                    </li>
                    <li>
                        <a href="mv_loginPage.do" style="color:#f3f3f3;">Login</a>
                    </li>
                </ul>
            </td>
        </tr>
        </tbody>
    </table>
</div>

</header>
</body>
</html>
