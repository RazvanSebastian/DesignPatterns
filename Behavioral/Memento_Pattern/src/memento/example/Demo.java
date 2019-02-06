package memento.example;

public class Demo {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker careTaker = new Caretaker();

		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.save(originator.saveStateToMemento());

		originator.setState("State #3");
		careTaker.save(originator.saveStateToMemento());

		originator.setState("State #4");
		System.out.println("Current State: " + originator.getState());

		originator.getStateFromMemento(careTaker.revert());
		System.out.println("Last saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.revert());
		System.out.println("First saved State: " + originator.getState());
	}

}
