

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import airport.Airline;
import airport.AirlineInterface;
import airport.Flight;
import airport.Subcompanys;
import persons.Traveler;
import search.SearchByDestinationStrategy;
import search.SearchByPriceStrategy;
import search.Searcher;
import search.SearchingStrategy;

public class Main {
    public static void main(String[] args){
        int changeChoose;
        Scanner input = new Scanner(System.in);

List <Flight> map  = new ArrayList<>();

        Airline elal = new Airline("elal");
        AirlineInterface sandor = new Subcompanys("sandor");
        elal.addsubcompany(sandor);
        Flight f1 = new Flight("123s", false, 14, 9, 8, null, "Israel");
        Flight f2 = new Flight("1788s", false, 90, 9, 8, null, "Israel");
        Traveler t1 = new Traveler("linoy", "123s");

        System.out.print("Please choose the change you want to do: \n");
        System.out.print(
                """
                        [1] Cancel Flight
                        [2] Change Departure Time
                        [3] Change Landing Time
                        [4] Change Flight Price
                        Enter your choice from the above menu:\s"""
        );

        changeChoose = input.nextInt();
        System.out.println(changeChoose);


        f1.addPassenger(t1);
        t1.register(f1);
        map.add(f2);
        map.add(f1);
       
       

        Searcher searcher = new Searcher();
        SearchingStrategy priceSearch = new SearchByPriceStrategy();
        searcher.setStrategy(priceSearch);
        searcher.performSearch(map, "50");

        SearchingStrategy desSearch = new SearchByDestinationStrategy();
        searcher.setStrategy(desSearch);
        searcher.performSearch(map, "Israel");

    

        
    } 

}