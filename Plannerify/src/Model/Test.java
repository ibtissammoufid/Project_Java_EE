package Model;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static List<Client>  Afficher() throws ClassNotFoundException   {
		try {
	         /* //1
            Class.forName("com.mysql.jdbc.Driver");
            //2
            java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
            //3
            PreparedStatement prs = cn.prepareStatement("INSERT INTO client "
            		+ "(Nom_Client,Prenom_Client, Email_Client ,Ville_Client,Password_Client) VALUES (?,?,?,?,?)");
            prs.setString(1, Fname);
            prs.setString(2, Lname);
            prs.setString(3, email);
            prs.setString(4, Ville );
            prs.setString(5, pass);
           
            
          //4
            prs.execute();
           
*/
			
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
			PreparedStatement st= con.prepareStatement("select  Nom_Client , Prenom_Client  from client ");
			ResultSet rst =st.executeQuery();
			
			List<Client> premiereListe = new ArrayList<Client>();
			while(rst.next()) {
				String firstName = rst.getString("Nom_Client");
				String lastName= rst.getString("Prenom_Client");
				
				//String imageUrl= rst.getString("");
				
				
				Client rb= new Client();
				rb.setNom_Client(firstName);
				rb.setPrenom_Client(lastName);
				
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
