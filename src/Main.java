import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	/*	ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("EventsSave.txt"));
		EventList el = new EventList();	
		Event e1 = new Event(new EventDate(10,6,2021),"Dnes");
		el.addEvent(e1);
		Event e2 = new Event(new EventDate(11,6,2021),"Z�tra");
		el.addEvent(e2);
		Event e3 = new Event(new EventDate(12,6,2021),"Poz�t��");
		el.addEvent(e3);
		Event e4 = new Event(new EventDate(9,6,2021),"V�era");
		el.addEvent(e4);	
		Event e5 = new Event(new EventDate(18,6,2021),"Dal�� t�den");
		el.addEvent(e5);
		
		s.writeObject(el);
		s.close();*/
		
		
		
		

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("EventsSave.txt"));
        EventList elInput = (EventList)inputStream.readObject();
        elInput.printWeek();
	}

}
