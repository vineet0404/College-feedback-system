package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class show_005fstud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <table height=\"100%\" width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"20%\"> \n");
      out.write("                <center><img src=\"D:\\Vineet\\BSc.IT\\logo.png\" width=\"100 px\" height=\"100 px\"></center>\n");
      out.write("                    </td>\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                <center><h1>Nalanda Acdemy</h1></center>\n");
      out.write("                    </td>\n");
      out.write("                    <td width=\"20%\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <header>\n");
      out.write("  \n");
      out.write("                        <nav class=\"navbar\">   \n");
      out.write("                            <ul> \n");
      out.write("        <li style=\"display:inline;\"><a class=\"active\" href=\"index.html\">Home</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"admi.html\">Admission</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"Student.jsp\">Student</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"office.html\">Office</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"package.html\">About us</a></li> \n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("   \n");
      out.write("    </nav>\n");
      out.write("   \n");
      out.write("  </header>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("<!-- home section starts  -->\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("<section class=\"home\" id=\"home\">\n");
      out.write("\n");
      out.write("<div class=\"video-container\">\n");
      out.write("\n");
      out.write("    <video src=\"D:\\Vineet\\BSc.IT\\video.mp4\" muted loop autoplay  height=\"100%\" width=\"100%\"></video>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        \n");
      out.write("    <h1 style=\"color:#fff;\">Welcome!!!!</h1>\n");
      out.write("\n");
      out.write("    <div class=\"define\">\n");
      out.write("     <td>   <br><br>\n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("<br><br>\n");
      out.write("        </td>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("</section>\n");
      out.write("            </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("<!-- footer section starts  -->\n");
      out.write("\n");
      out.write("<section class=\"footer\">\n");
      out.write("\n");
      out.write("<h1 class=\"credit\">Created by <span>Vineet</span> | all rights reserved. </h1>\n");
      out.write("<div class=\"sm\">\n");
      out.write("<a href=\"https:\\\\facebook.com\"><img src=\"D:\\Vineet\\BSc.IT\\fb.png\" height=\"40\"width=\"70\"></a>\n");
      out.write("<a href=\"https:\\\\twitter.com\"><img src=\"D:\\Vineet\\BSc.IT\\tr.png\" height=\"40\" width=\"50\"></a>\n");
      out.write("<a href=\"https:\\\\instagram.com\"><img src=\"D:\\Vineet\\BSc.IT\\in.png\" height=\"40\" width=\"50\"></a>\n");
      out.write("<a href=\"https:\\\\whatapp.com\"><img src=\"D:\\Vineet\\BSc.IT\\wp.png\" height=\"60\" width=\"50\"></a></div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer section ends -->\n");
      out.write("    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
