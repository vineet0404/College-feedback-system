/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vivek Singh
 */
import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SendMail extends HttpServlet {
    private static final long serialVersionUID = 1L;
       

    public SendMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("tName");
		req.setAttribute("tName",name );
		
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Send an email to the user
		String userid=req.getParameter("txtemail");
		req.setAttribute("txtemail",userid );
		
		String pass=req.getParameter("tpass");
		req.setAttribute("tpass",pass );
		
		//get the email address from the session
		HttpSession session=req.getSession();  
                String name=(String) session.getAttribute("tName"); 
        
		//email confirmation for food donation
		String emailBody="Welcome to Nalanda Acdemy.Your User_ID is"+userid+"And password is"+pass+". Please send don't share your user id and password";
		
		String emailSubject="ID and Password.";
		
		String toEmailAddress=name;
		
		p1.email.send("singhvineet23456@gmail.com","XXXXXX",toEmailAddress,emailSubject,emailBody); 
		
		
		
	}


}
