package Model;

public class ReservationBD {
	int Id_Reservation,Id_Client,Id_Menu;
	String Detail_Client,Detail_Organisateur;
	java.sql.Date Date_Reservation,Date_Evenement,Date_RDV;
	public int getId_Reservation() {
		return Id_Reservation;
	}
	public void setId_Reservation(int id_Reservation) {
		Id_Reservation = id_Reservation;
	}
	public int getId_Client() {
		return Id_Client;
	}
	public void setId_Client(int id_Client) {
		Id_Client = id_Client;
	}
	public int getId_Menu() {
		return Id_Menu;
	}
	public void setId_Menu(int id_Menu) {
		Id_Menu = id_Menu;
	}
	public String getDetail_Client() {
		return Detail_Client;
	}
	public void setDetail_Client(String detail_Client) {
		Detail_Client = detail_Client;
	}
	public String getDetail_Organisateur() {
		return Detail_Organisateur;
	}
	public void setDetail_Organisateur(String detail_Organisateur) {
		Detail_Organisateur = detail_Organisateur;
	}
	public java.sql.Date getDate_Reservation() {
		return Date_Reservation;
	}
	public void setDate_Reservation(java.sql.Date date_Reservation) {
		Date_Reservation = date_Reservation;
	}
	public java.sql.Date getDate_Evenement() {
		return Date_Evenement;
	}
	public void setDate_Evenement(java.sql.Date date_Evenement) {
		Date_Evenement = date_Evenement;
	}
	public java.sql.Date getDate_RDV() {
		return Date_RDV;
	}
	public void setDate_RDV(java.sql.Date date_RDV) {
		Date_RDV = date_RDV;
	}

}
