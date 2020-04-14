package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReservationDao {
	public void add_reservation(java.sql.Date date_evenement , String detail_client,int id_menu, String email_client) {
		 try {
	            //1
	            Class.forName("com.mysql.jdbc.Driver");
	            //2
	            java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
	            //3
	            
	            //Recuperer l'id du client
	            PreparedStatement pr = cn.prepareStatement("select Id_Client from client where Email_Client=?");
	            pr.setString(1, email_client);
	            ResultSet rst =pr.executeQuery();
	        	while(rst.next()) {
					int id_client = rst.getInt("Id_Client");
					 PreparedStatement prs = cn.prepareStatement("INSERT INTO reservation "
			            		+ "(Date_Evenement,Detail_Client, Id_Client ,Id_Menu) VALUES (?,?,?,?)");
			            prs.setDate(1, date_evenement);
			            prs.setString(2, detail_client);
			            prs.setInt(3, id_client);
			            prs.setInt(4, id_menu);
			           
			           
			            
			          //4
			            prs.execute();
					
				}
	            
	            
	           
	           

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}

}
