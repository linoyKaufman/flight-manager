import java.util.*;

public class Airline {
   private  String name;
   private List <Subcompanys> subcompanys;
   private List <Flight> flights;
   private List <Airline> subAirlines;
   private List <Employee> Employee;


    public Airline(String name){
        this.name = name;
    }

    public void addflight(Flight fl){
        flights.add(fl);
    }

    public void addemployee(Employee fl){
        Employee.add(fl);
    }

    public void addSubAirline(Airline air){
        subAirlines.add(air);
    }

    public List<Flight> getFlights(){
        return flights;
    }

    public List<Airline> getSubAirlines(){
        return subAirlines;
    }

    public String getName(){
        return name;
    }

}
