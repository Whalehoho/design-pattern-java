package notifier;

// Decorator Abstract Class
abstract class Decorator implements Notifier {
    protected Notifier notifier;  // Reference to a Notifier object

    public Decorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);  // Delegate the notification to the wrapped notifier
    }
}
