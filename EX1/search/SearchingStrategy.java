package EX1.search;

import java.util.*;

import EX1.airport.Flight;
public interface SearchingStrategy {
    void search(List<Flight> flights,String searchRange );
}
