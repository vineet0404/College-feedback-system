<%-- 
    Document   : show_stud
    Created on : 11 Apr, 2021, 10:50:11 PM
    Author     : Vivek Singh
--%>

<%@page contentType="text/html" import="java.sql.*;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <table height="100%" width="100%">
                <tr>
                    <td width="20%"> 
                <center><img src="D:\Vineet\BSc.IT\logo.png" width="100 px" height="100 px"></center>
                    </td>
                    <td colspan="3">
                <center><h1>Nalanda Acdemy</h1></center>
                    </td>
                    <td width="20%">
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <header>
  
                        <nav class="navbar">   
                            <ul> 
        <li style="display:inline;"><a class="active" href="index.html">Home</a></li>
        <li style="display:inline;"><a href="admi.html">Admission</a></li>
        <li style="display:inline;"><a href="office.html">Office</a></li>
        <li style="display:inline;"><a href="package.html">About us</a></li> 
     
    </ul>
   
    </nav>
   
  </header>
                </tr>
                <tr>
                    
<!-- home section starts  -->

    <tr>
<section class="home" id="home">

<div class="video-container">

    <video src="D:\Vineet\BSc.IT\video.mp4" muted loop autoplay  height="100%" width="100%"></video>
        
</div>
                <center>
                    <div class="content">
                        
    <h1 style="color:#fff;">Welcome!!!!</h1>

    <div class="define">
        <br><br>
        
        <%
            try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false","root","vin123");
            String query="select * from hotel;";
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(query);
            out.println("<table width= 50% border=1 cellspacing=0 cellpadding=0>");
            out.println("<tr><th>Artist Name</th><th>Drawing name</th><th>Cost</th></tr>");
            while(rs.next())
            {
                out.println("<tr><td>");
                out.println(rs.getString(1));
                out.println("</td><td>"+rs.getString(2));
                out.println("</td><td>"+rs.getString(3));
                out.println("</td></tr>");
            }
            out.println("</table>");
        }
        catch(Exception e){out.println(e);}
        %><br><br>
        
    </div>
    
</div>
</center>
</section>
            </tr>
                
                <tr>
                    
<!-- footer section starts  -->

<section class="footer">

<h1 class="credit">Created by <span>Vineet</span> | all rights reserved. </h1>
<div class="sm">
<a href="https:\\facebook.com"><img src="D:\Vineet\BSc.IT\fb.png" height="40"width="70"></a>
<a href="https:\\twitter.com"><img src="D:\Vineet\BSc.IT\tr.png" height="40" width="50"></a>
<a href="https:\\instagram.com"><img src="D:\Vineet\BSc.IT\in.png" height="40" width="50"></a>
<a href="https:\\whatapp.com"><img src="D:\Vineet\BSc.IT\wp.png" height="60" width="50"></a></div>
</section>



<!-- footer section ends -->
    
                </tr>
                
                
            </table>
        </form>
    </body>
</html>
