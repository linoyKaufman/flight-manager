
package EX1.flightchanges;

// This interface represents an observer for flight change notifications.
public interface FlightChangeObserver {
    // Method to subscribe an observer to receive flight change notifications.
    void subscribe(Observer observer);
    // Method to unsubscribe an observer from flight change notifications.
    void unsubscribe(Observer observer);
    // Method to notify subscribers about flight changes.
    void notifySubscribers(String message);
}

