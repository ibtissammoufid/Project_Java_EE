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

import Model.Repondre_ReservationDao;



@WebServlet("/Repondre_Reservation")
public class Repondre_Reservation extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date_evenement=request.getParameter("date_rdv");
		//
		
		SimpleDateFormat fd=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateUtile;
		
		
		
	    String detail_organisateur=request.getParameter("detail_organisateur");
	    HttpSession session=request.getSession();
	    int id_reservation=(int) session.getAttribute("id_reservation");
	    

	    
	 
	    try {
			dateUtile = fd.parse(date_evenement);
			java.sql.Date de= new java.sql.Date(dateUtile.getTime());
			 Repondre_ReservationDao dao = new Repondre_ReservationDao();
			    
			    dao.modify_reservation(de , detail_organisateur, id_reservation);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	   
	   
        response.sendRedirect("Profil_Organisateur.jsp");

	}
	
}
