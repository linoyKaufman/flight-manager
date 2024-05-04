package search;


import java.util.*;

import airport.Flight;
public class SearchByDestinationStrategy implements SearchingStrategy {
    @Override
    public void search(List<Flight> flights, String searchRange) {
        for (int i=0; i< flights.size();i++) {
            if (flights.get(i).getdetination().equalsIgnoreCase(searchRange)) { 
                System.out.println(flights.get(i)+"dest");
            }
        }
    }
 } 

