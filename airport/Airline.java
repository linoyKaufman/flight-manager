package airport;
import java.util.*;

import persons.Employee;
public class Airline implements AirlineInterface {
   private  String name;
   private List <AirlineInterface> subcompanys;
   private List <Flight> flights;
   private List <Employee> Employee;


    public Airline(String name){
        this.name = name;
        this.subcompanys= new ArrayList<>();
    }

    public void addflight(Flight fl){
        flights.add(fl);
    }

    public void addemployee(Employee fl){
        Employee.add(fl);
    }

    public List<Flight> getFlights(){
        return flights;
    }

    public List<AirlineInterface> getSubAirlines(){
        return subcompanys;
    }

    public String getName(){
        return name;
    }

    @Override
    public void printdetails() {
        System.out.println(this.name);
        for(AirlineInterface company : subcompanys){
            company.printdetails();
        }
        
    }

    public void addsubcompany (AirlineInterface sub){
        subcompanys.add(sub);

    }

}
