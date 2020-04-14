package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Afficher_Reservation_Organisateur {
	public static List<ReservationBD>  Afficher(String email_organisateur) throws ClassNotFoundException   {
		try {
			
	    		
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
			PreparedStatement st= con.prepareStatement("select * from reservation where Id_Menu in(select Id_Menu from menu where Id_Organistaeur in(select Id_Organistaeur from organisateur where Email_Organisateur=?))");
			st.setString(1, email_organisateur);
			ResultSet rst =st.executeQuery();
			
			
			//select * from reservation where Id_Menu in(select Id_Menu from menu where Id_Organistaeur in(select Id_Organistaeur from organisateur where Email_Organisateur=?))
			
			
			List<ReservationBD> premiereListe = new ArrayList<ReservationBD>();
			while(rst.next()) {
				java.sql.Date Date_Reservation=rst.getDate("Date_Reservation");
				java.sql.Date Date_Evenement=rst.getDate("Date_Evenement");
				java.sql.Date Date_RDV=rst.getDate("Date_RDV");
				String Detail_Client = rst.getString("Detail_Client");
				String Detail_Organisateur= rst.getString("Detail_Organisateur");
				int Id_Client= rst.getInt("Id_Client");
				int id_menu= rst.getInt("Id_Menu");
				int id_reservation= rst.getInt("Id_Reservation");
				
				
				//String imageUrl= rst.getString("");
				
				
				ReservationBD rb= new ReservationBD();
				rb.setDate_Reservation(Date_Reservation);
				rb.setDate_Evenement(Date_Evenement);
				rb.setDate_RDV(Date_RDV);
				rb.setDetail_Client(Detail_Client);
				rb.setDetail_Organisateur(Detail_Organisateur);
				rb.setId_Client(Id_Client);
				rb.setId_Menu(id_menu);
				rb.setId_Reservation(id_reservation);
				
				premiereListe.add(rb);
			}	
			return premiereListe;
		    }
		catch ( SQLException e) {
				System.out.println("");
		}
		return null ;
     }


}
