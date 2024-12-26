package observer;

// ConcreteObserver
public class Website implements Observer {
    private String webNews;

    @Override
    public void update(String news) {
        this.webNews = news;
        System.out.println("Website updated with news: " + webNews);
    }
}
