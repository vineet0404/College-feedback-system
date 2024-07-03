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
public class prina extends HttpServlet {

    
     public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String u,p;
        u=req.getParameter("tuser");
        p=req.getParameter("tpass");
        PrintWriter pw=res.getWriter();
        if(u.equals("vineet@gmail.com") && p.equals("vin123"))
        {
           
            res.sendRedirect("princ.jsp");
        }
        else
        {
            pw.println("Go back and click the link to you booking");
            pw.println("Recorded Inserted.");
        }
        
    }
}