package memento;

import java.util.Stack;

// The Caretaker manages the mementos. It does not know the details of the memento's state
public class History {
    private Stack<Memento> history = new Stack<>();

    public void save(Memento memento) {
        history.push(memento);  // Add a snapshot to the history
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();  // Restore the last saved state
        }
        return null;
    }
}

