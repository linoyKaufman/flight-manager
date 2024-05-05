package EX1.search;


import java.util.List;

import EX1.airport.Flight;

public interface FlightSearchStrategy {
    void search(List<Flight> flights, String searchRange);
}