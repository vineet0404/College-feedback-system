import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vineet
 */
public class teach extends HttpServlet {

    
     public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String u,p;
        u=req.getParameter("tuser");
        p=req.getParameter("tpass");
        PrintWriter pw=res.getWriter();
        if(u.equals("teacher@gmail.com") && p.equals("tea123"))
        {
            pw.println("Success full entry");
            pw.println("<a href='stshow.jsp'>click here</a>");
        }
        else
        {
            pw.println("Please enter correct id and password");
            res.sendRedirect("Teacher.jsp");
        }
        
    }
}