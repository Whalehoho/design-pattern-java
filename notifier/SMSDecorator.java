package notifier;

// Concrete Decorator

// SMS Decorator
class SMSDecorator extends Decorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // First, call the wrapped notifier's send method
        sendSMS(message);  // Add SMS functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
