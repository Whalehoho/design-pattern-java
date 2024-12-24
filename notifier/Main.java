package notifier;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();  // Create a basic notifier
        notifier.send("Hello, this is a simple notification!");

        System.out.println("\n--- Adding SMS functionality ---");
        // Wrap the BasicNotifier with the SMSDecorator
        Notifier smsNotifier = new SMSDecorator(notifier);
        smsNotifier.send("Hello, this is a SMS notification!");

        System.out.println("\n--- Adding Facebook functionality ---");
        // Wrap the SMSNotifier with the FacebookDecorator
        Notifier facebookNotifier = new FacebookDecorator(smsNotifier);
        facebookNotifier.send("Hello, this is a SMS + Facebook notification!");

        System.out.println("\n--- Adding Email functionality ---");
        // Wrap the FacebookNotifier with the EmailDecorator
        Notifier emailNotifier = new EmailDecorator(facebookNotifier);
        emailNotifier.send("Hello, this is a SMS + Facebook + Email notification!");
    }
}
