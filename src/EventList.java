import java.io.Serializable;
import java.util.ArrayList;

public class EventList implements Serializable {
	ArrayList<Event> events = new ArrayList<Event>();
	
	
	public void addEvent(Event ev) {
		events.add(ev);
		reArange();
	}
	
	private void reArange() {
		boolean sorted = false;
		Event temp;
		while(!sorted) {
		sorted = true;
			for (int i = 0; i < events.size() - 1; i++) {
				if (events.get(i).getDate().toDays() > events.get(i + 1).getDate().toDays()) {
				temp = events.get(i);
				events.set(i, events.get(i + 1));
				events.set(i + 1, temp);
				sorted = false;
				}
			}
		}		
	}
	
	private ArrayList<Event> getWeekList(EventDate week) {

		ArrayList<Event> weekEvents = new ArrayList<Event>();
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getDate().compareDateInWeek(week)) {
				weekEvents.add(events.get(i));
			}
			
		}
		return weekEvents;
	}
	
	private ArrayList<Event> getWeekList() {
		ArrayList<Event> weekEvents = new ArrayList<Event>();
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getDate().compareDateInWeek()) {
				weekEvents.add(events.get(i));
			}
			
		}
		return weekEvents;
	}
	
	public void printWeek(EventDate d) {
		ArrayList<Event> evl = getWeekList(d);
		for (int j = 0; j < evl.size(); j++) {
			System.out.println(evl.get(j));
		}
	}
	
	public void printWeek() {
		ArrayList<Event> evl = getWeekList();
		
		for (int j = 0; j < evl.size(); j++) {
			System.out.println(evl.get(j));
		}
	}
	
}
