package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public abstract void addMessageToStream(String state);
	public abstract String getLastMessageFromStream();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			 observer.update();
		}
	}
}
