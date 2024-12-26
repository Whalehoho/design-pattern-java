package memento;

// The Memento class captures the internal state of the Originator
public class Memento {
    private final String state;  // Stores the text content (immutable)

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state; // Only accessible by the originator
    }
}