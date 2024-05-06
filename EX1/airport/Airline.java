package EX1.airport;
import java.util.*;
import EX1.persons.*;

// This class represents an Airline entity.

public class Airline implements AirlineInterface {
   private  String name;
   private List <AirlineInterface> subcompanys;// Represents subsidiary airlines
   private List <Flight> flights; // Represents flights operated by this airline
   private List <Employee> Employee; // Represents employees working for this airline

    // Constructor to initialize the Airline with a name.

    public Airline(String name){
        this.name = name;
        this.subcompanys= new ArrayList<>();
    }

    // Method to add a flight to the airline's list of flights.
    public void addflight(Flight fl){
        flights.add(fl);
    }

    // Method to add an employee to the airline's list of employees.
    public void addemployee(Employee fl){
        Employee.add(fl);
    }

    // Method to retrieve the list of flights operated by the airline.
    public List<Flight> getFlights(){
        return flights;
    }
    // Method to retrieve the list of subsidiary airlines.
    public List<AirlineInterface> getSubAirlines(){
        return subcompanys;
    }
    // Method to retrieve the name of the airline.
    public String getName(){
        return name;
    }
    // Method to print details of the airline and its subsidiary airlines recursively.
    @Override
    public void printdetails() {
        System.out.println(this.name);
        for(AirlineInterface company : subcompanys){
            company.printdetails();
        }
        
    }
    // Method to add a subsidiary airline to the airline.
    public void addsubcompany (AirlineInterface sub){
        subcompanys.add(sub);

    }

}
