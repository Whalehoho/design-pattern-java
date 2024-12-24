package notifier;

// Concrete Decorator

// Facebook Decorator
class FacebookDecorator extends NotifierDecorator {
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // First, call the wrapped notifier's send method
        sendFacebook(message);  // Add Facebook functionality
    }

    private void sendFacebook(String message) {
        System.out.println("Sending Facebook message: " + message);
    }
}
