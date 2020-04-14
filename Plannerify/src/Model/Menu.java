package Model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Base64;


public class Menu {
	private String Nom_Menu,Description_Menu,Image_Menu;
	int Prix_Menu;
	public String getImage_Menu() {
		return Image_Menu;
	}
	public void setImage_Menu(String image_Menu) {
		Image_Menu = image_Menu;
	}
	private int Id_Menu,Id_Organisateur;
	public String getNom_Menu() {
		return Nom_Menu;
	}
	public void setNom_Menu(String nom_Menu) {
		Nom_Menu = nom_Menu;
	}
	public int getPrix_Menu() {
		return Prix_Menu;
	}
	public void setPrix_Menu(int prix_Menu) {
		Prix_Menu = prix_Menu;
	}
	public String getDescription_Menu() {
		return Description_Menu;
	}
	public void setDescription_Menu(String description_Menu) {
		Description_Menu = description_Menu;
	}
	public int getId_Menu() {
		return Id_Menu;
	}
	public void setId_Menu(int id_Menu) {
		Id_Menu = id_Menu;
	}
	public int getId_Organisateur() {
		return Id_Organisateur;
	}
	public void setId_Organisateur(int id_Organisateur) {
		Id_Organisateur = id_Organisateur;
	}
	
	public String blobToString(java.sql.Blob blob) throws SQLException, IOException {
		java.io.InputStream inputStream = blob.getBinaryStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[16384];
        int bytesRead = -1;
         
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);                  
        }
         
        byte[] imageBytes = outputStream.toByteArray();
        String picture = Base64.getEncoder().encodeToString(imageBytes);
        return picture;
	}

}
