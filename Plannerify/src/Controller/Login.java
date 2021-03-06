package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.LoginDao;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("Login.jsp").forward(request,response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
	    String pass=request.getParameter("pass");
	    
	    LoginDao dao = new LoginDao();
	    
	    if(dao.check(email, pass)){
	        HttpSession session=request.getSession();
	        session.setAttribute("email", email);
	        response.sendRedirect("Accueil_Client.jsp");
	    }
	    else{
	        
	        response.sendRedirect("Login.jsp");
	    }

	}


}