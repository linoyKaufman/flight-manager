
package EX1.airport;
import java.util.*;

import EX1.flightchanges.FlightChangeObserver;
import EX1.flightchanges.Observer;
import EX1.persons.*;


public class Flight implements FlightChangeObserver {
    private String flightcode;
    private boolean iscancelled;
    private float price;
    private int departureTime;
    private int LandingTime;
    private List <Traveler> passengers;
    private String destination;
    private List <Observer> subscribers;

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

    public int getdepartureTime() {
        return departureTime;
    }

    public String getdetination() {
        return destination;
    }

    public int getFlightTime() {
       int flightTime = LandingTime - departureTime;
        return flightTime;
    }

    public float getPrice() {
        return price;
    }

    public boolean iscancelled() {
        return iscancelled;
    }

    public String getName() {
        return flightcode;
    }

    public void setPrice(float price){
        this.price = price;
        notifySubscribers("price changed");
    }

    public void cancelleflight(){ 
        iscancelled=true;
        notifySubscribers("flight cancelled");
    }

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

    public void addPassenger(Traveler passenger) {
        passengers.add(passenger);
    }

    public int getNumPassengers() {
        return passengers.size();
    }

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