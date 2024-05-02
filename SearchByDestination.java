
import java.util.List;

public class SearchByDestination implements FlightSearchStrategy {
    
    public void search(List<Flight> flights, String searchRange) {
        for (int i=0; i< flights.size();i++) {
            if (flights.get(i).getdetination().equalsIgnoreCase(searchRange)) { 
                System.out.println(flights.get(i));
            }
        }
    }
}
