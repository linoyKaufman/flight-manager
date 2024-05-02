
import java.util.List;

public interface FlightSearchStrategy {
    void search(List<Flight> flights, String searchRange);
}