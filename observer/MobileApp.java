package observer;

// ConcreteObserver
public class MobileApp implements Observer {
    private String appNews;

    @Override
    public void update(String news) {
        this.appNews = news;
        System.out.println("MobileApp received news: " + appNews);
    }
}
