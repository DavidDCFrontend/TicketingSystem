package es.dsw.models;

public class Booking {
	
	private String idFilm;
	private String sala;
	private String fName;
	private String fSurname;
	private String fMail;
	private String fRepMail;
	private String fDate;
	private String fHour;
	private int fNumAdults;
	private int fNumChildren;
	
	public Booking(String idFilm, String sala) {
		this.idFilm = idFilm;
		this.sala = sala;
	}

	public String getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(String idFilm) {
		this.idFilm = idFilm;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfSurname() {
		return fSurname;
	}

	public void setfSurname(String fSurname) {
		this.fSurname = fSurname;
	}

	public String getfMail() {
		return fMail;
	}

	public void setfMail(String fMail) {
		this.fMail = fMail;
	}

	public String getfRepMail() {
		return fRepMail;
	}

	public void setfRepMail(String fRepMail) {
		this.fRepMail = fRepMail;
	}

	public String getfDate() {
		return fDate;
	}

	public void setfDate(String fDate) {
		this.fDate = fDate;
	}

	public String getfHour() {
		return fHour;
	}

	public void setfHour(String fHour) {
		this.fHour = fHour;
	}

	public int getfNumAdults() {
		return fNumAdults;
	}

	public void setfNumAdults(int fNumAdults) {
		this.fNumAdults = fNumAdults;
	}

	public int getfNumChildren() {
		return fNumChildren;
	}

	public void setfNumChildren(int fNumChildren) {
		this.fNumChildren = fNumChildren;
	}
}
