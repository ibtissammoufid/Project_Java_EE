package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	public void add(String Fname , String Lname,String Ville ,String email , String pass) {
		 try {
	            //1
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
	           

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}

}