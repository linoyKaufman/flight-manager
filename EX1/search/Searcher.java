package EX1.search;

import java.util.*;

import EX1.airport.Flight;
// This class represents a searcher that performs flight searches using a specified strategy.
public class Searcher {
    private SearchingStrategy strategy;
    // Method to set the searching strategy.
    public void setStrategy(SearchingStrategy strategy) {
        this.strategy = strategy;
    }
    public void performSearch(List<Flight> flights, String searchRange ) {
       strategy.search(flights, searchRange );
    }
}