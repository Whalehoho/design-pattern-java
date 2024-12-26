package observer;


public interface Subject {
    void attach(Observer observer);     // Add an observer
    void detach(Observer observer);     // Remove an observer
    void notifyObservers();             // Notify all observers
}

