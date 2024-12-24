package notifier;

// Concrete Decorator

// Email Decorator
class EmailDecorator extends Decorator {
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // First, call the wrapped notifier's send method
        sendEmail(message);  // Add Email functionality
    }

    private void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }
}
