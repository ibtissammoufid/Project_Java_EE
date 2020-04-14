package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Visiter_Profil {
	public static Organisateur  Afficher_Info_Organisateur(String id_organisateur) throws ClassNotFoundException   {
		try {
			
	    		
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
			PreparedStatement st= con.prepareStatement("select * from organisateur where Id_Organistaeur=? ");
			st.setString(1, id_organisateur);
			ResultSet rst =st.executeQuery();
			
			
			
			while(rst.next()) {
				String Nom_Organisateur = rst.getString("Nom_Organisateur");
				String Email_Organisateur= rst.getString("Email_Organisateur");
				int contact_organisateur= rst.getInt("Contact_Organisateur");
				String Ville_Organisateur= rst.getString("Ville_Organisateur");
				String Description_Organisateur= rst.getString("Description_Organisateur");
				String Adresse_Organisateur = rst.getString("Adresse_Organisateur");

				
				//String imageUrl= rst.getString("");
				
				
				Organisateur rb= new Organisateur();
				rb.setNom_Organisateur(Nom_Organisateur);
				rb.setEmail_Organisateur(Email_Organisateur);
				rb.setContact_Organisateur(contact_organisateur);
				rb.setVille_Organisateur(Ville_Organisateur);
				rb.setDescription_Organisateur(Description_Organisateur);
				rb.setAdresse_Organisateur(Adresse_Organisateur);
				return rb;
				
			}
		
		    }
		catch ( SQLException e) {
				System.out.println("");
		}
		return null ;
     }


}
