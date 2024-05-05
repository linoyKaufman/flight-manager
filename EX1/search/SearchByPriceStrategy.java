package EX1.search;

import java.util.*;

import EX1.airport.Flight;
public class SearchByPriceStrategy implements SearchingStrategy {
    @Override
    public void search(List<Flight> flights, String searchRange ) {
        float PriceRange = Float.parseFloat(searchRange);
        for(int i=0; i<flights.size();i++)
        {
            if(flights.get(i).getPrice()<= PriceRange){
                System.out.println(flights.get(i).toString()+"price");
            }

        }
    }
    
    }
