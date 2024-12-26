package observer;

public class Client {
    public static void main(String[] args) {
        // Create the subject (news agency)
        NewsAgency newsAgency = new NewsAgency();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer website = new Website();
        Observer emailSystem = new EmailSystem();

        // Attach observers to the subject
        newsAgency.attach(mobileApp);
        newsAgency.attach(website);
        newsAgency.attach(emailSystem);

        // Update the state of the subject and notify observers
        System.out.println("Publishing Breaking News...");
        newsAgency.setLatestNews("Breaking News: Observer Pattern Explained!");
    }
}
