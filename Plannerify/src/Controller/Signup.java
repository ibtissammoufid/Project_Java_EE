package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Model.SignupDao;


@WebServlet("/Signup")
public class Signup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Fname=request.getParameter("Fname");
	    String Lname=request.getParameter("Lname");
	    String ville=request.getParameter("ville");
	    String email=request.getParameter("email");
	    String pass=request.getParameter("pass");
	    
	    
	    SignupDao dao = new SignupDao();
	    
	    dao.add(Fname , Lname, ville , email , pass);
	    HttpSession session=request.getSession();
        session.setAttribute("email", email);
        response.sendRedirect("Accueil_Client.jsp");

	}


}