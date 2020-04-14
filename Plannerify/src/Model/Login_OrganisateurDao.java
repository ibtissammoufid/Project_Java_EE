package Model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_OrganisateurDao {
	public boolean check(String email , String pass) {
		 try {
	            //1
	            Class.forName("com.mysql.jdbc.Driver");
	            //2
	            java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
	            //3
	            PreparedStatement prs = cn.prepareStatement("SELECT * FROM organisateur where Email_Organisateur=? and Password_organisateur=?");
	            prs.setString(1, email);
	            prs.setString(2, pass);
	            
	            ResultSet rs = prs.executeQuery();
	            //
	           
	            if (rs.next()){
	                return true;
	               
	            }
	           

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		return false;
	}

}
