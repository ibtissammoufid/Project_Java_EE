package Model;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Add_MenuDao {
	public void add_menu(String nomMenu , String prix,String description ,InputStream fichier_image) {
		 try {
	            //1
	            Class.forName("com.mysql.jdbc.Driver");
	            //2
	            java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Plannerify","root","");
	            //3
	            PreparedStatement prs = cn.prepareStatement("INSERT INTO menu "
	            		+ "(Nom_Menu,Prix_Menu, Description_Menu ,Image_Menu) VALUES (?,?,?,?)");
	            prs.setString(1, nomMenu);
	            prs.setString(2, prix);
	            prs.setString(3, description);
	            prs.setBlob(4, fichier_image );
	            
	           
	            
	          //4
	            prs.execute();
	           

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}


}
