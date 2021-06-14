import java.io.Serializable;
import java.util.Date;

public class EventDate implements Serializable {
	private int day;
	private int month;
	private int year;
	private int[] months_length = {31,28,31,30,31,30,31,31,30,31,30,31};

	public EventDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	private boolean compareDate(EventDate d1, EventDate d2) {
		if (d1.getYear() == d2.getYear()) {
			if (d1.getMonth() == d2.getMonth()) {
				if (d1.getDay() == d2.getDay()) {
					return true;
				}
				
			}
		}
		return false;
	}
	
	public boolean compareDateInWeek(EventDate week) {
		EventDate temp = this;
		for (int i = 0; i < 7; i++) {
			if (compareDate(week, temp)) {
				return true;
			}
			temp.nextDay(temp);
		}
		return false;
	}
	
	public boolean compareDateInWeek() {
		Date date = new Date();
		EventDate week = new EventDate(date.getDate(), date.getMonth() + 1,date.getYear() + 1900);
		EventDate temp = this;
		for (int i = 0; i < 7; i++) {
			if (compareDate(week, temp)) {
				return true;
			}
			week.nextDay(week);
		}
		return false;
	}
	
	private void nextDay(EventDate d) {
		d.setDay(d.getDay() + 1);;
		if(d.getDay() > d.getMonths_length()[d.getMonth()]) {
			d.setMonth(d.getMonth() + 1);
			d.setDay(1);
		}
		if(d.getMonth() > 12) {
			d.setYear(d.getYear() + 1);
			d.setMonth(1);
		}
		
	}
	
	
	public int toDays() {
		return day + month*30 + year*365;
		
	}
	
	public String toString() {	
		return day + "." + month + "." + year;	
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int[] getMonths_length() {
		return months_length;
	}

	public void setMonths_length(int[] months_length) {
		this.months_length = months_length;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
