package observer.observer;

import observer.subject.Subject;

public abstract class Observer {

	protected Subject subject;
	
	public abstract void update();
}