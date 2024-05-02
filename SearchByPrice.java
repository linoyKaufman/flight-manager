import java.util.List;

public class SearchByPrice implements FlightSearchStrategy {
 
    public void search(List<Flight> flights, String searchRange) {
        float PriceRange = Float.parseFloat(searchRange);
        for(int i=0; i<flights.size();i++)
        {
            if(flights.get(i).getPrice()<= PriceRange){
                System.out.println(flights.get(i).toString());
            }

        }
    }
}