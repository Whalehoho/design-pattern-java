package observer;

import java.util.ArrayList;
import java.util.List;


//Concrete Subject
public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);  // Notify each observer with the latest news
        }
    }

    // Method to update the latest news and notify observers
    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers(); // Trigger updates to all observers
    }
}

