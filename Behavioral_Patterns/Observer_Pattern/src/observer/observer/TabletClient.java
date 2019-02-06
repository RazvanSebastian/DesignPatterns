package observer.observer;

import observer.subject.Subject;

public class TabletClient extends Observer {

	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.addMessageToStream(message);
	}

	@Override
	public void update() {
		System.out.println("Tablet client -> Notify: " + subject.getLastMessageFromStream());
	}

}
