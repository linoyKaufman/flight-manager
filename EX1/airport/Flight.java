
package EX1.airport;
import java.util.*;

import EX1.flightchanges.FlightChangeObserver;
import EX1.flightchanges.Observer;
import EX1.persons.*;

// This class represents a flight in the airline system.
public class Flight implements FlightChangeObserver {
    private String flightcode; // Flight code
    private boolean iscancelled; // Flag indicating whether the flight is cancelled
    private float price; // Price of the flight
    private int departureTime;// Departure time of the flight
    private int LandingTime; // Landing time of the flight
    private List <Traveler> passengers; // List of passengers booked on the flight
    private String destination; // Destination of the flight
    private List <Observer> subscribers; // List of subscribers observing flight changes

    // Constructor to initialize the Flight object with flight details.
    public Flight(String flightcode, boolean iscancelled, float price, int departureTime, int LandingTime , List <Traveler> passengers,String destination ) {
        this.flightcode = flightcode;
        this.iscancelled = iscancelled;
        this.price = price;
        this.departureTime = departureTime;
        this.LandingTime = LandingTime;
        this.destination=destination;
        this.passengers = new ArrayList<>();
        this.subscribers = new ArrayList<>();
        
    }
// Method to get the departure time of the flight.
    public int getdepartureTime() {
        return departureTime;
    }
// Method to get the destination of the flight.
    public String getdetination() {
        return destination;
    }
// Method to calculate the duration of the flight.
    public int getFlightTime() {
       int flightTime = LandingTime - departureTime;
        return flightTime;
    }
// Method to get the price of the flight.
    public float getPrice() {
        return price;
    }
// Method to check if the flight is cancelled.
    public boolean iscancelled() {
        return iscancelled;
    }
  // Method to get the flight code.
    public String getName() {
        return flightcode;
    }
    // Method to set the price of the flight and notify subscribers.
    public void setPrice(float price){
        this.price = price;
        notifySubscribers("price changed");
    }
    // Method to cancel the flight and notify subscribers.
    public void cancelleflight(){ 
        iscancelled=true;
        notifySubscribers("flight cancelled");
    }
    // Method to set the departure time of the flight and adjust landing time accordingly, then notify subscribers.
    public void setDepartureTime(int newdepartureTime){
        int delay = newdepartureTime - this.departureTime;
        this.LandingTime = this.LandingTime + delay;
        this.departureTime = newdepartureTime;
        notifySubscribers("departure time changed");

    }

    @Override
    public String toString() {
        return  "flight code :" + this.flightcode ;
    }
    // Method to add a passenger to the flight.
    public void addPassenger(Traveler passenger) {
        passengers.add(passenger);
    }
    // Method to get the number of passengers booked on the flight.
    public int getNumPassengers() {
        return passengers.size();
    }
    // Method to set the flight code.
    public void setFlightNumber(String newname) {
        this.flightcode = newname;

    }

    @Override
    public void subscribe(Observer observer) {
       subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
       for(Observer observer : subscribers){
        observer.update(message);
       }
    }
    
    public void addtoflight (Traveler passenger){
        passengers.add(passenger);
    }
    public void removetoflight (Traveler passenger){
        passengers.remove(passenger);
    }

  
   
}