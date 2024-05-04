
package flightchanges;

public interface FlightChangeObserver {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String message);
}

