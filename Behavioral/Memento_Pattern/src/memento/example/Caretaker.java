package memento.example;

import java.util.Stack;

public class Caretaker {

	private Stack<Memento> mementoList = new Stack<Memento>();

	public void save(Memento state) {
		mementoList.push(state);
	}

	public Memento revert() {
		return mementoList.pop();
	}

}
