package observer;

// ConcreteObserver
public class EmailSystem implements Observer {
    private String emailNews;

    @Override
    public void update(String news) {
        this.emailNews = news;
        System.out.println("EmailSystem received news: " + emailNews);
    }
}
