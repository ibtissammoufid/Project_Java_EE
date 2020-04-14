package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Repondre_ReservationDao {
	public void modify_reservation(java.sql.Date date_rdv , String detail_organisateur,int id_reservation) {
		 try {
	            //1
	            Class.forName("com.mysql.jdbc.Driver");
	            //2
	            java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
	            //3
	            
	           
	       
					 PreparedStatement prs = cn.prepareStatement("UPDATE reservation SET Date_RDV = ?, Detail_Organisateur =? WHERE Id_Reservation=?");
			            prs.setDate(1, date_rdv);
			            prs.setString(2, detail_organisateur);
			            prs.setInt(3, id_reservation);
			          
			           
			           //UPDATE reservation SET Date_RDV = ?, Detail_Organisateur =? WHERE Id_Reservation=?;
			            
			          //4
			            prs.execute();
					
				
	            
	            
	           
	           

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}


}
