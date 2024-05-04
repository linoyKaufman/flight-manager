

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
        int selectChoose;
        Scanner input = new Scanner(System.in);

List <Flight> map  = new ArrayList<>();

        Airline elal = new Airline("elal");
        AirlineInterface sandor = new Subcompanys("sandor");
        elal.addsubcompany(sandor);
        Flight f1 = new Flight("123s", false, 14, 9, 8, null, "Israel");
        Flight f2 = new Flight("1788s", false, 90, 9, 8, null, "Israel");
        Traveler t1 = new Traveler("linoy", "123s");

        System.out.print("Please select the option you are interested in \n");
        System.out.print(
                """
                        [1] search a Flight
                        [2] see flight info
                        [3] you would like to make a change
                        Enter your choice from the above menu:\s"""
        );
        selectChoose = input.nextInt();

        if(selectChoose == 1)
        {
            int select;
            System.out.print("Please choose according to which parameter you would like to search for the flight: \n");
            System.out.print(
                    """
                            [1] by price
                            [2] by destination
                            Enter your choice from the above menu:\s"""
            );
            select = input.nextInt();
            if (select ==1) {

                
            }
            else{

            }
    
        }
        if (selectChoose == 2 ) {
            String name;
            System.out.print("what is the flight code? \n");
            name = input.nextLine();
            for(int i=0;i<map.size();i++){
                if(map.get(i).getName().equals(name)){
                    map.get(i).toString();
                }
            }
 
        }
        if (selectChoose==3) {
            System.out.print("Please choose the change you want to do: \n");
            System.out.print(
                    """
                            [1] Cancel Flight
                            [2] Change Departure Time
                            [3] Change Flight Price
                            Enter your choice from the above menu:\s"""
            );
            changeChoose = input.nextInt();
            System.out.println(changeChoose);
            if(changeChoose == 1 )
            {
                String name;
                System.out.print("what is the flight code? \n");
                name = input.nextLine();
                for(int i=0;i<map.size();i++){
                    if(map.get(i).getName().equals(name)){
                        map.get(i).cancelleflight();
                    }
                }
            }
            if(changeChoose == 2 )
            {
                String name;
                System.out.print("what is the flight code? \n");
                name = input.nextLine();
                System.out.print("what is the updated Departure Time? \n");
                int time = input.nextInt();
                for(int i=0;i<map.size();i++){
                    if(map.get(i).getName().equals(name)){
                        map.get(i).setDepartureTime(time);
                    }
                }
            }
            if(changeChoose == 3 )
            {
                String name;
                System.out.print("what is the flight code? \n");
                name = input.nextLine();
                System.out.print("what is the updated price? \n");
                int price = input.nextInt();
                for(int i=0;i<map.size();i++){
                    if(map.get(i).getName().equals(name)){
                        map.get(i).setPrice(price);
                    }
                }
            }
            


            
        }



       

     


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