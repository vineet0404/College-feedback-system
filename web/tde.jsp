<%-- 
    Document   : tde
    Created on : 12 Apr, 2021, 8:00:21 PM
    Author     : Vivek Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body0
        <form method="post">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="Name"</td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit"></td>
                    <td><input type="reset" value="Reset"></td>
                </tr>
            </table>
        </form>
            <c:if test="${pageContext.request.method=='POST'}">
        <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/p?autoReconnect=true&useSSL=false" user="root" password="vin123"/>
        <sql:update dataSource="${db}">
            delete from p5 where Name="${param.Name}";
        </sql:update>
            <sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/p?autoReconnect=true&useSSL=false" user="root" password="vin123"/>
            <sql:query var="as" dataSource="${ds}">
                Select * from p5;
            </sql:query>
                <table border="1">
                <tr>
                    <td>Name</td>
                    <td>Age</td>
                    <td>Qualification</td>
                    <td>Phone</td>
                    <td>sub/<td>

                </tr>
                <c:forEach items="${as.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.Name}"></c:out></td>
                        <td><c:out value="${row.Age}"></c:out></td>
                        <td><c:out value="${row.qaul}"></c:out></td>
                        <td><c:out value="${row.phone}"></c:out></td>
                        <td><c:out value="${row.sub}"></c:out></td>
                    </tr>
                </c:forEach>
                </table>
</c:if>
                    
    </body>
</html>
