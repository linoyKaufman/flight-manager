package search;

import java.util.*;

import airport.Flight;
public interface SearchingStrategy {
    void search(List<Flight> flights,String searchRange );
}
