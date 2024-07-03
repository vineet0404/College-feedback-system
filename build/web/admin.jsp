<%-- 
    Document   : admin
    Created on : 7 Apr, 2021, 8:09:25 PM
    Author     : Vivek Singh
--%>
<%@page import="p1.*;" %>
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
                String Full_name=request.getParameter("tName");
                String Age=request.getParameter("Age");
                String Pho=request.getParameter("Phone");
                String Fath=request.getParameter("Father");
                String Moth=request.getParameter("mother");
                String Email=request.getParameter("txtemail");
                String Pass=request.getParameter("tpass");
                
                String query="insert into p3 values('"+Full_name+"','"+Age+"','"+Pho+"','"+Fath+"','"+Moth+"','"+Email+"','"+Pass+"');";
                Statement st=c.createStatement();
                st.executeUpdate(query);
                out.println("<p>Thank You for registering. Your data has been recorded.</p>");
                out.println("<a href=''>Registered Data</a>");
                
            }
            catch(Exception e){out.println(e);}
        %>
      
    </body>
</html>
