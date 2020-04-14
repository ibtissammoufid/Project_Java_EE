package Controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Model.Add_MenuDao;
import Model.SignupDao;

/**
 * Servlet implementation class Add_Menu
 */
@WebServlet("/Add_Menu")
@MultipartConfig(maxFileSize = 16177215)
public class Add_Menu extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomMenu=request.getParameter("nomMenu");
	    String prix=request.getParameter("prix");
	    String description=request.getParameter("description");
	    javax.servlet.http.Part fichier_image =  request.getPart("fichier_image");
	    InputStream inputStream = null;
	    if(fichier_image!=null) {
	    	inputStream = fichier_image.getInputStream();
	    }
	    
	    
	    Add_MenuDao dao = new Add_MenuDao();
	    
	    dao.add_menu(nomMenu , prix, description , inputStream);
	    
        
        response.sendRedirect("wedding.jsp");

	}
}
