package observer.subject;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<String>();

	@Override
	public void addMessageToStream(String state) {
		messageHistory.add(state);
		notifyObservers();
	}

	@Override
	public String getLastMessageFromStream() {
		return messageHistory.getLast();
	}

}
