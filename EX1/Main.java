package EX1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EX1.airport.Airline;
import EX1.airport.AirlineInterface;
import EX1.airport.Flight;
import EX1.airport.Subcompanys;
import EX1.persons.Traveler;
import EX1.search.SearchByDestinationStrategy;
import EX1.search.SearchByPriceStrategy;
import EX1.search.Searcher;
import EX1.search.SearchingStrategy;


public class Main {
   public static void main(String[] args){
        int changeChoose;
       
        Scanner input = new Scanner(System.in);
        List <Flight> map  = new ArrayList<>();

        Airline elal = new Airline("elal"); //  
        AirlineInterface sandor = new Subcompanys("sandor");
        AirlineInterface elalcargo = new Subcompanys("elal cargo");
        elal.addsubcompany(sandor);
        elal.addsubcompany(elalcargo);
        Flight f1 = new Flight("123s", false, 14, 9, 8, null, "Israel");
        Flight f2 = new Flight("1788s", false, 90, 9, 8, null, "Israel");
        map.add(f2);
        map.add(f1);
        Traveler t1 = new Traveler("linoy", "123s");
        t1.register(f2);
        String choice = " ";


        do{
            System.out.print("Please select the option you are interested in \n");
            System.out.print(
                    """
                            [1] search a Flight
                            [2] print sub companys data
                            [3] you would like to make a change
                            Enter your choice from the above menu:\s"""
            );
            choice = input.next();
        switch (choice) {
        
            case "1":
                int select;
                System.out.print("Please choose according to which parameter you would like to search for the flight: \n");
                System.out.print(
                        """
                                [1] by price
                                [2] by destination
                                Enter your choice from the above menu:\s"""
                );
                select = input.nextInt();
                Searcher searcher = new Searcher();

                if (select ==1) {
                    
                    SearchingStrategy priceSearch = new SearchByPriceStrategy();
                    searcher.setStrategy(priceSearch);
                    searcher.performSearch(map, "50");

                }
                else{
                    SearchingStrategy desSearch = new SearchByDestinationStrategy();
                    searcher.setStrategy(desSearch);
                    searcher.performSearch(map, "Israel");

                }
                
                break;

            case "2":
                elal.printdetails();
                
            break;

            case "3":
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
                String name;
                if(changeChoose == 1 )
                {
                    
                    System.out.print("what is the flight code? \n");
                    name = input.next();
                    for(int i=0;i<map.size();i++){
                        if(map.get(i).getName().equals(name)){
                            map.get(i).cancelleflight();
                        }
                    }
                }
                if(changeChoose == 2 )
                {
                    System.out.print("what is the flight code? \n");
                    name = input.next();
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
                    
                    System.out.print("what is the flight code? \n");
                    name = input.next();
                    System.out.print("what is the updated price? \n");
                    int price = input.nextInt();
                    for(int i=0;i<map.size();i++){
                        if(map.get(i).getName().equals(name)){
                            map.get(i).setPrice(price);
                        }
                    }
                }

                break;
            
             default:
              System.out.println( "please enter ");
                break;
        
        }
         
        }
         while(!choice.equals("x"));


        
   
}

}