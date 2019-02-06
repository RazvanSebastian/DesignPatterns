package observer;

import observer.observer.PhoneClient;
import observer.observer.TabletClient;
import observer.subject.MessageStream;
import observer.subject.Subject;

public class Demo {

	public static void main(String[] args) {		
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);	
		TabletClient tabletClient = new TabletClient(subject);
		
		tabletClient.addMessage("Hello from tablet");
		System.out.println();
		phoneClient.addMessage("Hello from phone");
	}

}
