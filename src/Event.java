import java.io.Serializable;

public class Event implements Serializable {
	private EventDate date;
	private String note;
	
	public Event(EventDate date, String note) {
		super();
		this.date = date;
		this.note = note;
	}
	
	public String toString() {		
		return date + "\n ->" + note;
	}

	public EventDate getDate() {
		return date;
	}

	public String getNote() {
		return note;
	}
	
}
