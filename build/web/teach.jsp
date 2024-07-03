<%-- 
    Document   : teach
    Created on : 6 Apr, 2021, 10:56:23 AM
    Author     : Vivek Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="teach" method="post">
            <table>
                <tr>
                    <td>
                        Enter user id:
                    </td>
                    <td>
                        <input type="email" required="">
                    </td>
                </tr>
                <tr>
                    <td>
                        Enter password:
                    </td>
                    <td>
                        <input type="password" required="">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="submit">
                    </td>
                    <td>
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
