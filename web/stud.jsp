<%-- 
    Document   : stud
    Created on : 11 Apr, 2021, 4:58:17 PM
    Author     : Vivek Singh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" import="java.sql.*;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false","root","vin123");
            String query="select * from hotel1;";
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(query);
            out.println("<table border=1 cellspacing=0 cellpadding=0>");
            out.println("<tr><th width=100> First Name</th><th width=200>Last Name</th><th width=40>Age</th><th width=70>number</th><th>No of people</th><th>Room no</th></tr>");
            while(rs.next())
            {
              %>
    <c:if t
              <%
            }
            out.println("</table>");
        }
           
        catch(Exception e){out.println(e);}
        %>
         
    </body>
</html>
