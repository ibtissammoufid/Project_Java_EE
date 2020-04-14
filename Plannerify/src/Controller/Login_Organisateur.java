package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.LoginDao;
import Model.Login_OrganisateurDao;

/**
 * Servlet implementation class Login_Organisateur
 */
@WebServlet("/Login_Organisateur")
public class Login_Organisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("Login.jsp").forward(request,response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
	    String pass=request.getParameter("pass");
	    
	    Login_OrganisateurDao dao = new Login_OrganisateurDao();
	    
	    if(dao.check(email, pass)){
	        HttpSession session=request.getSession();
	        session.setAttribute("email_organisateur", email);
	        response.sendRedirect("Profil_Organisateur.jsp");
	    }
	    else{
	        
	        response.sendRedirect("Login_Organisateur.jsp");
	    }

	}


}
