package EX2.course;
public interface CourseObservers {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String message);
}

