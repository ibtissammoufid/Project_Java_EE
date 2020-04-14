package Model;

public class Client {
	private String Nom_Client,Prenom_Client,Email_Client,Ville_Client,Password_Client;
	private int Id_Client;
	public String getNom_Client() {
		return Nom_Client;
	}
	public void setNom_Client(String nom_Client) {
		Nom_Client = nom_Client;
	}
	public String getPrenom_Client() {
		return Prenom_Client;
	}
	public void setPrenom_Client(String prenom_Client) {
		Prenom_Client = prenom_Client;
	}
	public String getEmail_Client() {
		return Email_Client;
	}
	public void setEmail_Client(String email_Client) {
		Email_Client = email_Client;
	}
	public String getVille_Client() {
		return Ville_Client;
	}
	public void setVille_Client(String ville_Client) {
		Ville_Client = ville_Client;
	}
	public String getPassword_Client() {
		return Password_Client;
	}
	public void setPassword_Client(String password_Client) {
		Password_Client = password_Client;
	}
	public int getId_Client() {
		return Id_Client;
	}
	public void setId_Client(int id_Client) {
		Id_Client = id_Client;
	}

	
}