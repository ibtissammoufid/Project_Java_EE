package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

public class Menus {
	public static List<Menu>  Afficher(String type) throws ClassNotFoundException   {
		try {
			
	    		
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
			PreparedStatement st= con.prepareStatement("select * from menu where Id_Organistaeur in(select Id_Organistaeur from organisateur where Type_Organisateur=?) ORDER BY Prix_Menu ASC ");
			st.setString(1, type);
			ResultSet rst =st.executeQuery();
			
			
			List<Menu> premiereListe = new ArrayList<Menu>();
			while(rst.next()) {
				String firstName = rst.getString("Nom_Menu");
				int lastName= rst.getInt("Prix_Menu");
				String description= rst.getString("description_Menu");
				int id_menu= rst.getInt("Id_Menu");
				int id_organisateur= rst.getInt("Id_Organistaeur");
				
				//String imageUrl= rst.getString("");
				
				
				Menu rb= new Menu();
				rb.setNom_Menu(firstName);
				rb.setPrix_Menu(lastName);
				rb.setDescription_Menu(description);
				rb.setId_Menu(id_menu);
				rb.setId_Organisateur(id_organisateur);
				
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
