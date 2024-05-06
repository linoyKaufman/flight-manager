package EX1.persons;

import EX1.airport.Flight;
import EX1.flightchanges.Observer;
// This class represents a traveler in the system.
public class Traveler implements Observer{
    private String name;
    private String flightName;
    // Constructor to initialize the Traveler object with traveler details.
    public Traveler(String name, String flightName) {
        this.name = name;
        this.flightName = flightName;
    }
    // Method to get the name of the traveler.
    public String getName() {
        return name;
    }
    // Method to set the name of the traveler.
    public void setName(String name) {
        this.name = name;
    }
    // Method to get the name of the flight the traveler is interested in.
    public String getFlightName() {
        return flightName;
    }
    // Method to set the name of the flight the traveler is interested in.
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    // Method for the traveler to register for receiving flight change notifications.
    public void register (Flight flight){
        flight.subscribe(this);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    

}
