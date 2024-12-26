package memento;

// The Originator is the text editor
public class TextEditor {
    private String text;  // Internal state of the editor

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Create a memento to save the current state
    public Memento save() {
        return new Memento(text);
    }

    // Restore the state from a memento
    public void restore(Memento memento) {
        this.text = memento.getState();
    }
}

