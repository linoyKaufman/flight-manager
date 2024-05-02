import java.util.*;
import java.util.Set;

// Observer design pattern
public abstract class NotificationFlight{

    private List <Traveler> customers;

    public NotificationFlight(){
        this.customers = customers;
    }

    public void modify(String message) {
        for(int i=0; i<customers.size();i++){

            customers.get(i).Notification(message);
        }
        
    }


    
}
