package EX1.persons;

import EX1.airport.Flight;
import EX1.flightchanges.Observer;

public class Traveler implements Observer{
    private String name;
    private String flightName;

    public Traveler(String name, String flightName) {
        this.name = name;
        this.flightName = flightName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void register (Flight flight){
        flight.subscribe(this);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    

}
