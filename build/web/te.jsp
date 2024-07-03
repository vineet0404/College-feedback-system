<%-- 
    Document   : te
    Created on : 12 Apr, 2021, 1:15:51 PM
    Author     : Vivek Singh
--%>

        
<%@page contentType="text/html" import="java.sql.*;" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/p?autoReconnect=true&useSSL=false","root","vin123");
            String query="select * from p5;";
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(query);
            out.println("<table border=1 cellspacing=0 cellpadding=0>");
            out.println("<tr><td>Name</td><td>Age</td><td>Qualification</td><td>Phone</td><td>Subject</td></tr>");
            while(rs.next())
            {
                out.println("<tr><td>");
                out.println(rs.getString(1));
                out.println("</td><td>"+rs.getString(2));
                out.println("</td><td>"+rs.getString(3));
                out.println("</td><td>"+rs.getString(4));
                out.println("</td><td>"+rs.getString(5));
                out.println("</td></tr>");
            }
            out.println("</table>");
        }
           
        catch(Exception e){out.println(e);}
        %>
        <a href="tde.jsp"> <input class="btn" type="submit" value="Delete"></a>
        <a href="tin.jsp"><input class="btn" type="submit" value="Insert"></a>
          
              
    </body>
</html>

    </body>
</html>
