package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Teacher_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body background=\"#fff\">\n");
      out.write("        \n");
      out.write("            <table width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"20%\"> \n");
      out.write("                <center><img src=\"D:\\Vineet\\BSc.IT\\logo.png\" width=\"100\" height=\"100\"></center>\n");
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
      out.write("        <li style=\"display:inline;\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"admi.html\">Admission</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"student.html\">Student</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a class=\"active\" href=\"office.html\">Office</a></li>\n");
      out.write("        <li style=\"display:inline;\"><a href=\"package.html\">About us</a></li> \n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("   \n");
      out.write("    </nav>\n");
      out.write("   \n");
      out.write("  </header>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("            <form action=\"\">\n");
      out.write("                <table><tr>\n");
      out.write("                        <td>\n");
      out.write("                            User ID:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" name=\"tuser\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Password\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"pass\" name=\"tpass\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>        \n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("<section class=\"footer\">\n");
      out.write("\n");
      out.write("<h1 class=\"credit\">Created by <span>Vineet</span> | all rights reserved. </h1>\n");
      out.write("<div class=\"sm\">\n");
      out.write("<a href=\"https:\\\\facebook.com\"><img src=\"img\\fb.png\" height=\"40\"width=\"70\"></a>\n");
      out.write("<a href=\"https:\\\\twitter.com\"><img src=\"img\\tr.png\" height=\"40\" width=\"50\"></a>\n");
      out.write("<a href=\"https:\\\\instagram.com\"><img src=\"img\\in.png\" height=\"40\" width=\"50\"></a>\n");
      out.write("<a href=\"https:\\\\whatapp.com\"><img src=\"img\\wp.png\" height=\"60\" width=\"50\"></a></div>\n");
      out.write("</section>\n");
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
