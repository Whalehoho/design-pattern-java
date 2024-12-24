package notifier;

// Concrete Component: Basic Notifier
class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}
