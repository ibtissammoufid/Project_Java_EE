package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Afficher_Reservation_Client {
	public static List<ReservationBD>  Afficher(String email_client) throws ClassNotFoundException   {
		try {
			
	    		
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
			PreparedStatement st= con.prepareStatement("select * from reservation where Id_Client =(select Id_Client from client where Email_Client=?)");
			st.setString(1, email_client);
			ResultSet rst =st.executeQuery();
			
			
			List<ReservationBD> premiereListe = new ArrayList<ReservationBD>();
			while(rst.next()) {
				java.sql.Date Date_Reservation=rst.getDate("Date_Reservation");
				java.sql.Date Date_Evenement=rst.getDate("Date_Evenement");
				java.sql.Date Date_RDV=rst.getDate("Date_RDV");
				String Detail_Client = rst.getString("Detail_Client");
				String Detail_Organisateur= rst.getString("Detail_Organisateur");
				int Id_Client= rst.getInt("Id_Client");
				int id_menu= rst.getInt("Id_Menu");
				
				
				//String imageUrl= rst.getString("");
				
				
				ReservationBD rb= new ReservationBD();
				rb.setDate_Reservation(Date_Reservation);
				rb.setDate_Evenement(Date_Evenement);
				rb.setDate_RDV(Date_RDV);
				rb.setDetail_Client(Detail_Client);
				rb.setDetail_Organisateur(Detail_Organisateur);
				rb.setId_Client(Id_Client);
				rb.setId_Menu(id_menu);
				
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
