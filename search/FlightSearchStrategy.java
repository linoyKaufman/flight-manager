package search;


import java.util.List;

import airport.Flight;

public interface FlightSearchStrategy {
    void search(List<Flight> flights, String searchRange);
}