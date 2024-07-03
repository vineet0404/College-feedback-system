<%-- 
    Document   : tin
    Created on : 12 Apr, 2021, 8:12:15 PM
    Author     : Vivek Singh
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="tName"></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>Qualification: </td>
                    <td><input type="text" name="qual"></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="number" name="phone"></td>
                </tr>
                <tr>
                    <td>Subject Teacher:</td>
                    <td><input type="text" name="sub"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit"></td>
                    <td><input type="reset" value="Reset"></td>
                </tr>
            </table>
        </form>
        <c:if test="${pageContext.request.method=='POST'}">
            <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/proj?autoReconnect=true&useSSL=false" user="root" password="vin123"/>
            <sql:update dataSource="${db}" var="rec">
                insert into stu(Name,Age,qual,phone,sub) values(?,?,?,?,?);
                <sql:param value="${param.tName}" />
                <sql:param value="${param.age}" />
                <sql:param value="${param.qual}" />
                <sql:param value="${param.phone}" />
                <sql:param value="${param.sub}" />
            </sql:update>
            <c:if test="${rec>=1}">
                <sql:query dataSource="${db}" var="res">
            select * from stu;
        </sql:query>
            <table border="1">
                <tr>
                    <td>Name</td>
                    <td>Age</td>
                    <td>Qualification</td>
                    <td>Phone</td>
                    <td>Subject</td>
                </tr>
                <c:forEach items="${res.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.Name}"></c:out></td>
                        <td><c:out value="${row.Age}"></c:out></td>
                        <td><c:out value="${row.qual}"></c:out></td>
                        <td><c:out value="${row.phone}"></c:out></td>
                        <td><c:out value="${row.sub}"></c:out></td>
                    </tr>
                </c:forEach>
</table>
            </c:if>
        </c:if>
           
                
    </body>
</html>
