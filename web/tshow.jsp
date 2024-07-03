<%-- 
    Document   : tshow
    Created on : 12 Apr, 2021, 11:07:46 PM
    Author     : Vivek Singh
--%>

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
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/p?autoReconnect=true&useSSL=false","root","vin123");
            String query="select * from p5;";
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(query);
            out.println("<table width= 50% border=1 cellspacing=0 cellpadding=0>");
            out.println("<tr><th>Name</th><th>Age</th><th>Qualification</th><th>Phone</th><th>Subject</th></tr>");
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
    </body>
</html>
