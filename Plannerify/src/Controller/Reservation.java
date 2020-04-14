package Controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.ReservationDao;
import Model.SignupDao;


@WebServlet("/Reservation")
public class Reservation extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date_evenement=request.getParameter("date_evenement");
		//
		
		SimpleDateFormat fd=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateUtile;
		
		
		
	    String detail_client=request.getParameter("detail_client");
	    HttpSession session=request.getSession();
	    int id_menu=(int) session.getAttribute("id_menu");
	    int id_organisateur=(int) session.getAttribute("id_organisateur");
	    //email du client
	    String email_client=(String) session.getAttribute("email");

	    
	 
	    try {
			dateUtile = fd.parse(date_evenement);
			java.sql.Date de= new java.sql.Date(dateUtile.getTime());
			 ReservationDao dao = new ReservationDao();
			    
			    dao.add_reservation(de , detail_client, id_menu,email_client);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	   
	   
        response.sendRedirect("Accueil_Client.jsp");

	}
	
}
