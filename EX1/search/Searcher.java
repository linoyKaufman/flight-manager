package EX1.search;

import java.util.*;

import EX1.airport.Flight;
public class Searcher {
    private SearchingStrategy strategy;
    public void setStrategy(SearchingStrategy strategy) {
        this.strategy = strategy;
    }
    public void performSearch(List<Flight> flights, String searchRange ) {
       strategy.search(flights, searchRange );
    }
}