package es.dsw.models;

public class ValidationForm {

	private boolean invalidName = false;
	private boolean invalidMail = false;
	private boolean invalidRepMail = false;
	private boolean invalidDate = false;
	private boolean invalidHour = false;
	private boolean invalidNumAdultsTickets = false;
	private boolean invalidNumChildrenTickets = false;
	
	public ValidationForm() {
		
	}
	
	public ValidationForm(boolean invalidName, boolean invalidMail, boolean invalidRepMail, boolean invalidDate,
			boolean invalidHour, boolean invalidNumAdultsTickets, boolean invalidNumChildrenTickets) {
		this.invalidName = invalidName;
		this.invalidMail = invalidMail;
		this.invalidRepMail = invalidRepMail;
		this.invalidDate = invalidDate;
		this.invalidHour = invalidHour;
		this.invalidNumAdultsTickets = invalidNumAdultsTickets;
		this.invalidNumChildrenTickets = invalidNumChildrenTickets;
	}

	public boolean isInvalidName() {
		return invalidName;
	}

	public boolean isInvalidMail() {
		return invalidMail;
	}

	public boolean isInvalidRepMail() {
		return invalidRepMail;
	}

	public boolean isInvalidDate() {
		return invalidDate;
	}

	public boolean isInvalidHour() {
		return invalidHour;
	}

	public boolean isInvalidNumAdultsTickets() {
		return invalidNumAdultsTickets;
	}

	public boolean isInvalidNumChildrenTickets() {
		return invalidNumChildrenTickets;
	}

	public void setInvalidName(boolean invalidName) {
		this.invalidName = invalidName;
	}

	public void setInvalidMail(boolean invalidMail) {
		this.invalidMail = invalidMail;
	}

	public void setInvalidRepMail(boolean invalidRepMail) {
		this.invalidRepMail = invalidRepMail;
	}

	public void setInvalidDate(boolean invalidDate) {
		this.invalidDate = invalidDate;
	}

	public void setInvalidHour(boolean invalidHour) {
		this.invalidHour = invalidHour;
	}

	public void setInvalidNumAdultsTickets(boolean invalidNumAdultsTickets) {
		this.invalidNumAdultsTickets = invalidNumAdultsTickets;
	}

	public void setInvalidNumChildrenTickets(boolean invalidNumChildrenTickets) {
		this.invalidNumChildrenTickets = invalidNumChildrenTickets;
	}
	
	
}
