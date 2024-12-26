package memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        // Initial state
        editor.setText("Version 1");
        System.out.println("Text: " + editor.getText());
        history.save(editor.save());  // Save state to history

        // Modify state
        editor.setText("Version 2");
        System.out.println("Text: " + editor.getText());
        history.save(editor.save());  // Save state to history

        // Modify state again
        editor.setText("Version 3");
        System.out.println("Text: " + editor.getText());

        // Undo to previous state
        editor.restore(history.undo());
        System.out.println("Undo 1: " + editor.getText());

        // Undo to the initial state
        editor.restore(history.undo());
        System.out.println("Undo 2: " + editor.getText());
    }
}
