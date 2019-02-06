package observer.observer;

import observer.subject.Subject;

public class PhoneClient extends Observer {

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.addMessageToStream(message);
	}

	@Override
	public void update() {
		System.out.println("Phone client -> Notify: " + subject.getLastMessageFromStream());
	}

}
